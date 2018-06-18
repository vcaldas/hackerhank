# https://www.hackerrank.com/challenges/s10-standard-deviation/problem

n = int(input())
values = input().split(" ")
values = [int(v) for v in values]
size = len(values)

def mean(arr):
    sum = 0
    for a in arr:
        sum = sum + a
    return sum/len(arr)
m = mean(values)

squares = [(i-m)**2 for i in values ]
print(round(mean(squares)**0.5, 1))