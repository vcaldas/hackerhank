#!/bin/python3

import sys


n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]
result = 0
for x in range(0,n):
    result += arr[x]
    
    
print(result)