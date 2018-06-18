#https://www.hackerrank.com/challenges/s10-quartiles/problem

n = int(input())
values = input().split(" ")
values = sorted([int(v) for v in values])
size = len(values)
L = []
U = []

# Lower and Upper
if size%2 == 1:
    
    L = values[: round(size/2)]
    U = values[round(size/2)+1: ]
else:
    L = values[: (round(size/2))]
    U = values[round(size/2): ]



def get_median(arr):
    size = len(arr)
    if size%2 == 1:
        return arr[round(size/2) ]
    else:
        return (arr[round(size/2)-1] + arr[round(size/2)])/2
# print(L)
# print(U)

print(int(get_median(L)))
print(int(get_median(values)))
print(int(get_median(U)))