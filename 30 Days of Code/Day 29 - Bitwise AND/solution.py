#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        max_k = 0
        nk = input().split()

        n = int(nk[0])

        k = int(nk[1])    
        print(k-1 if ((k-1) | k) <= n else k-2)
#         for A in range(1, n):
#             for B in range(A+1, n+1):
#                 value = A&B
#                 if k > value > max_k:
#                     max_k = value
        
       # print(max_k)
                