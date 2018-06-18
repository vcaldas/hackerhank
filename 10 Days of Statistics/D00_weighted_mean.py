n = int(input())
values = input().split(" ")
values = [float(v) for v in values]
weights = input().split(" ")
weights = [float(v) for v in weights]

def weighed_average(values, weights):
    product = [a*b for a,b in zip(values,weights)]
    total = sum(product)
    w_total = sum(weights)
    return round(total/w_total,1)

print(weighed_average(values, weights))