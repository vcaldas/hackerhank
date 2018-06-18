#https://www.hackerrank.com/challenges/itertools-combinations-with-replacement/problem

from itertools import combinations_with_replacement


if __name__ == '__main__':
    s, n = input().split()
    n = int(n)
    s = ''.join(sorted(s))
    
    for a in list(combinations_with_replacement(s,n)):
        print(''.join(a))