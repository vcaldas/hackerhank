#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    N = int(input())

    if (N%2 ==1):
        print("Weird")
    else:
        if(5>= N >= 2):
            print("Not Weird")
        elif(20>= N >= 6):
            print("Weird")
        elif (N > 20):
            print("Not Weird")
    