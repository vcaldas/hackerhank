    

def get_runner(arr):
    for i in arr:
        if (i<top_score):
            return i

if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    arr = sorted(arr, reverse=True)
    top_score = max(arr)
    print(get_runner(arr))
        
            