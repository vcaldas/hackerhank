n = int(input())
values = input().split(" ")
values = [float(v) for v in values]
values = sorted(values)

def get_mean(values):
    sum = 0
    for v in values:
        sum = sum + v
    return sum / len(values)

def get_median(values):
    
    # average middle elements
    size = len(values)
    center = round(size/2) 
    
    if len(values)%2 == 0:
        a = values[center]
        b = values[center-1]
        return (a+b)/2
    else:
        return values[center]

def get_mode(values):
    counts = []
    mode = max(values)
    for i in values:
        counts.append(values.count(i))
    max_count = max(counts)
    indices = [i for i, x in enumerate(counts) if x == max_count]
    
    for i in indices:
        value = values[i]
        if (value < mode): 
            mode = value
            
    
    return mode
    
    
print(get_mean(values))
print(get_median(values))
print(get_mode(values))