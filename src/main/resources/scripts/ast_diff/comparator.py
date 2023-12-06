import glob
import json
import copy


def read_json_file(address):
    with open(address, "r") as read_file:
        content = read_file.read().replace('boolean_type', 'boolean')
        data = json.loads(content)
        # data = json.load(read_file)
    return data


def extract_diff_sitter_content(plain_content):
    result = {"New": {}, "Old": {}}
    for group in plain_content["hunks"]:
        if "New" in group:
            base_key = "New"
        else:
            base_key = "Old"
        for item in group[base_key]:
            for entry in item["entries"]:
                content = entry["text"]
                if content not in result[base_key]:
                    result[base_key][content] = 0
                result[base_key][content] += 1
    return result


def fix_bad_characters(data):
    bad_characters = ['\\n', '\\"', '\\t', '\r']
    result = copy.deepcopy(data)
    for base_key in ["New", "Old"]:
        for key, value in data[base_key].items():
            if any(map(lambda bad_character: bad_character in key, bad_characters)):
                result[base_key].pop(key)
                if all(map(lambda bad_character: bad_character != key, bad_characters)):
                    for bad_character in bad_characters:
                        key = key.replace(bad_character, '')
                    result[base_key][key] = value
    return result


def is_match(diff_sitter, gga_diff):
    match_terms(diff_sitter, gga_diff)
    match_symmetrical_keys(diff_sitter)
    match_symmetrical_keys(gga_diff)
    remove_zero_terms(diff_sitter)
    remove_zero_terms(gga_diff)

    for base_key in ["New", "Old"]:
        if (len(gga_diff[base_key]) != 0) or (len(diff_sitter[base_key]) != 0):
            return False

    return True


def match_terms(diff_sitter, gga_diff):
    for base_key in ["New", "Old"]:
        for key, diff_value in diff_sitter[base_key].items():
            if key in gga_diff[base_key]:
                gga_value = gga_diff[base_key][key]
                gga_diff[base_key][key] = max(0, gga_value - diff_value)
                diff_sitter[base_key][key] = max(0, diff_value - gga_value)

    for base_key in ["New", "Old"]:
        for key, diff_value in diff_sitter[base_key].items():
            quot_key = f'"{key}"'
            if quot_key in gga_diff[base_key]:
                gga_value = gga_diff[base_key][quot_key]
                gga_diff[base_key][quot_key] = max(0, gga_value - diff_value)
                diff_sitter[base_key][key] = max(0, diff_value - gga_value)


def remove_zero_terms(data):
    for base_key in ["New", "Old"]:
        delete_list = []
        for key, value in data[base_key].items():
            if value == 0 or key.startswith('/**'):
                delete_list.append(key)
        for key in delete_list:
            data[base_key].pop(key)
        if '"' in data[base_key]:
            data[base_key].pop('"')
        if '""' in data[base_key]:
            data[base_key].pop('""')


def match_symmetrical_keys(data):
    for key, new_value in data['New'].items():
        if key in data['Old']:
            old_value = data['Old'][key]
            data['Old'][key] = max(0, old_value - new_value)
            data['New'][key] = max(0, new_value - old_value)


def swap_base_keys(data):
    tmp = data.pop('New')
    data['New'] = data['Old']
    data['Old'] = tmp


def changes(data):
    count = 0
    for base_key in ["New", "Old"]:
        count += len(data[base_key])
    return count


if __name__ == '__main__':
    # files = glob.glob("/home/mamareza/UofC/Thesis/new-approach/src/main/resources/Mays/*/*/Output/*.json")
    files = glob.glob("/home/mamareza/UofC/Thesis/CodeSearchNet/notebooks/java/CodeSearchNetMine/*/*/Output/*.json")
    diff_sitter = None
    gga_diff = None
    success = 0
    failed = 0

    addresses = set()
    for address in files:
        addresses.add(address[:address.rfind('/')])

    for index, address in enumerate(addresses, start=1):
        try:
            diff_sitter_plain = read_json_file(f'{address}/DiffSitter.json')
            diff_sitter = fix_bad_characters(extract_diff_sitter_content(diff_sitter_plain))
            gga_diff = fix_bad_characters(read_json_file(f'{address}/GGADifferences.json'))

            dc_gga_diff = copy.deepcopy(gga_diff)
            dc_diff_sitter = copy.deepcopy(diff_sitter)

            if is_match(diff_sitter, gga_diff):
                print(f"{index}: ✓")
                success += 1
            else:
                swap_base_keys(dc_diff_sitter)
                if is_match(dc_diff_sitter, dc_gga_diff):
                    print(f"{index}: ✓")
                    success += 1
                else:
                    print(f"{index}: X {address}")
                    if changes(gga_diff) + changes(diff_sitter) > changes(dc_gga_diff) + changes(dc_diff_sitter):
                        gga_diff = dc_gga_diff
                        diff_sitter = dc_diff_sitter
                    print(f'Generalization: {gga_diff}')
                    print(f'DiffSitter    : {diff_sitter}')
                    print("-------------------------------")
                    failed += 1
        except Exception as e:
            print(e)

    print(f"Success: {success}, Failed: {failed}")
