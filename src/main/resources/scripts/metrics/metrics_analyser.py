SIMPLIFY_PACKAGE_NAMES = True


class Metric:
    def __init__(self, m1, m2, m3):
        self.OCavg = m1
        self.OCmax = m2
        self.WMC = m3


def extract_metrics(address):
    result = {}

    file = open(address, "r")
    for line in file:
        parts = line.split()

        if SIMPLIFY_PACKAGE_NAMES:
            class_name = parts[0].split('.')[-1]
        else:
            class_name = parts[0]

        if len(parts) == 4:
            result[class_name] = Metric(float(parts[1]), float(parts[2]), float(parts[3]))
        else:
            result[class_name] = Metric(float(0), float(0), float(parts[1]))
    return result


def sort_metrics(metrics):
    return {k: v for k, v in sorted(metrics.items(), key=lambda item: item[1], reverse=True)}


def extract_similarities(metrics1, metrics2, metric):
    similarities = {}
    for key in metrics1:
        if key in metrics2:
            if metric == 'OCavg':
                similarities[key] = abs(metrics1[key].OCavg - metrics2[key].OCavg)
            elif metric == 'OCmax':
                similarities[key] = abs(metrics1[key].OCmax - metrics2[key].OCmax)
            else:
                similarities[key] = abs(metrics1[key].WMC - metrics2[key].WMC)

    return sort_metrics(similarities)


def extract_differences(v1, v2, metric):
    differences = {}
    for key in v1:
        if key not in v2:
            if metric == 'OCavg':
                differences[key] = v1[key].OCavg
            elif metric == 'OCmax':
                differences[key] = v1[key].OCmax
            else:
                differences[key] = v1[key].WMC

    return sort_metrics(differences)


def print_stats(nodes):
    for index, key in enumerate(nodes):
        if index >= 10:
            return
        print(f"\t{index+1}. {key}: {nodes[key]}")


if __name__ == '__main__':
    metrics1 = extract_metrics('radisson/2.9.0.txt')
    metrics2 = extract_metrics('radisson/3.23.4.txt')

    metrics = ['OCavg', 'OCmax', 'WMC']
    for m in metrics:
        similar_nodes = extract_similarities(metrics1, metrics2, metric=m)
        removed_nodes = extract_differences(metrics1, metrics2, metric=m)
        new_nodes = extract_differences(metrics2, metrics1, metric=m)

        print(f"Stats for {m}:")
        print("Similar nodes:")
        print_stats(similar_nodes)
        print("Removed nodes:")
        print_stats(removed_nodes)
        print("Added nodes:")
        print_stats(new_nodes)
        print("-" * 50)

    print("DONE!")
