#!/bin/python3

import sys


n = int(input().strip())
height = [int(height_temp) for height_temp in input().strip().split(' ')]

#get the highest candle value
h = max(height)
counter = 0
for x in range(n):
    if(height[x] == h):
        counter +=1
        
print(counter)