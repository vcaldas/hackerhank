#!/bin/python

import sys


a,b,c,d,e = input().strip().split(' ')
a,b,c,d,e = [int(a),int(b),int(c),int(d),int(e)]

array = [a,b,c,d,e]
n = len(array)

total_array = []
total = 0;

for x in range(n):
   total += array[x]
#print(total)

for x in range(n):
    total_array.append(total-array[x])

print(min(total_array), max(total_array))