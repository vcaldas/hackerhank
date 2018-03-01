#!/bin/python3

import sys

a0,a1,a2 = input().strip().split(' ')
a0,a1,a2 = [int(a0),int(a1),int(a2)]
b0,b1,b2 = input().strip().split(' ')
b0,b1,b2 = [int(b0),int(b1),int(b2)]
# Write Your Code Here
a = [a0,a1,a2]
b = [b0,b1,b2]
scoreA = 0;
scoreB = 0;

for x in range(len(a)):
    if(a[x] > b[x]):
        scoreA = scoreA + 1
    elif (a[x] < b[x]):
        scoreB = scoreB + 1
        
result = [scoreA, scoreB]
print(scoreA,scoreB)