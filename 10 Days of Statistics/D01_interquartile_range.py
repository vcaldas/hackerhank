# https://www.hackerrank.com/challenges/s10-interquartile-range/problem

n = int(input())
arr = input().split(" ")
arr = [int(v) for v in arr]

freq = input().split(" ")
freq = [int(f) for f in freq]

# Create array
values = []
for idx, v in enumerate(arr):
    for f in range(freq[idx]):
        values.append(v)
    
        
L = []
U = []
values = sorted(values)
size = len(values)
# Lower and Upper
if size%2 == 1:
    L = values[: round(size/2)-1]
    U = values[round(size/2): ]
else:
    L = values[: (round(size/2))]
    U = values[round(size/2): ]

def get_median(arr):
    size = len(arr)
    if size%2 == 1:
        return arr[round(size/2) -1]
    else:
        return (arr[round(size/2)-1] + arr[round(size/2)])/2
# print(L)
# print(U)
# print(len(L))
# print(len(U))

# print(L)
# print(U)
answer = get_median(U) - get_median(L)
print("%0.1f" % (answer,))
