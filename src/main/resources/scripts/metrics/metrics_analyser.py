class Metric:
    def __init__(self, m1, m2, m3):
        self.m1 = m1
        self.m2 = m2
        self.m3 = m3


def extract_metrics(address):
    result = {}

    file = open(address, "r")
    for line in file:
        parts = line.split()
        result[parts[0]] = Metric(float(parts[1]), float(parts[2]), float(parts[3]))

    return result


def sort_metrics(metrics):
    return {k: v for k, v in sorted(metrics.items(), key=lambda item: item[1], reverse=True)}


def extract_similarities(metrics1, metrics2):
    similarities = {}
    for key in metrics1:
        if key in metrics2:
            similarities[key] = abs(metrics1[key].m1 - metrics2[key].m1)

    return sort_metrics(similarities)


def extract_differences(v1, v2):
    differences = {}
    for key in v1:
        if key not in v2:
            differences[key] = v1[key].m1

    return sort_metrics(differences)


if __name__ == '__main__':
    metrics1 = extract_metrics('metrics3.txt')
    metrics2 = extract_metrics('metrics1.txt')

    similar_nodes = extract_similarities(metrics1, metrics2)
    removed_nodes = extract_differences(metrics1, metrics2)
    new_nodes = extract_differences(metrics2, metrics1)

    print("DONE!")
