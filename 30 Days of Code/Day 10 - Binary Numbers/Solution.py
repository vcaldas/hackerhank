#!/bin/python3

import sys

def to_binary(n):
    if n == 0:
        return 0
    else:
        return (n % 2 +  10 * to_binary(int(n / 2)))

def count_ones(binary):
    count = 1;
    max_count = 1;
    
    for i in range(1, len(binary)):
        if((binary[i-1] == binary[i]) & (binary[i] == "1")):
            count +=1
            if(count >= max_count):
              max_count = count
            
        else:
            count = 1

    return max_count

n = int(input().strip())

binary = str(to_binary(n))
print(count_ones(binary))