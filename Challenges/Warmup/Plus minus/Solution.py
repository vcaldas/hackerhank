#!/bin/python3

import sys


n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]

zeros       = 0
positives   = 0
negatives   = 0

for x in range(n):
    if (arr[x] == 0):
        zeros += 1
    elif(arr[x] < 0):
        negatives +=1
    elif(arr[x] > 0):
        positives +=1

        
#positive
print(round(positives/n, 6))
#negative
print(round(negatives/n, 6))
#zeros
print(round(zeros/n, 6))
