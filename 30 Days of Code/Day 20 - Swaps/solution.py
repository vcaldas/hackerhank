#!/bin/python3

import sys

n = int(input().strip())
a = list(map(int, input().strip().split(' ')))
# Write Your Code Here
total = 0 

def swap(a, j):
    value_1, value_2 = a[j], a[j+1]
    a[j] = value_2
    a[j+1] = value_1
    
    return a
    
    
for i in range(n):
    # Track number of elements swapped during a single array traversal
    numberOfSwaps = 0;
    
    for j in range(n-1):
    # Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]):            
            a = swap(a, j)
            numberOfSwaps +=1

    # If no elements were swapped during a traversal, array is sorted
    if (numberOfSwaps == 0):
        break;
 
    total = total + numberOfSwaps 
    
    
print("Array is sorted in {} swaps.".format(total))
print("First Element: {}".format(a[0]))
print("Last Element: {}".format(a[-1]))
