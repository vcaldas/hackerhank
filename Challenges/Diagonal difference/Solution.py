#!/bin/python3

import sys


n = int(input().strip())
a = []
for a_i in range(n):
    a_t = [int(a_temp) for a_temp in input().strip().split(' ')]
    a.append(a_t)

    
#size of square matrix n
#sum main diagonal
main = 0 
secondary = 0

for x in range(n):
    #print(a[x][x])
    main += a[x][x]
for x in range(n):
   # print(a[n-1-x][x])
    secondary += a[n-1-x][x]
    
print(abs(main-secondary))
