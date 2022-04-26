class Metric:
    def __init__(self):
        self.m1 = 0
        self.m2 = 1
        self.m3 = 2


def extract_metrics(address):
    return {"file_name": Metric()}


def sort_metrics(metrics):
    return {k: v for k, v in sorted(metrics.items(), key=lambda item: item[1])}


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
            differences[key] = v1[key]

    return sort_metrics(differences)


if __name__ == '__main__':
    metrics1 = extract_metrics('metrics1.csv')
    metrics2 = extract_metrics('metrics2.csv')

    similar_nodes = extract_similarities(metrics1, metrics2)
    new_nodes = extract_differences(metrics1, metrics2)
    removed_nodes = extract_differences(metrics2, metrics1)

    print("DONE!")
