def solution(s):
    s = s.lower()
    p = 0
    y = 0
    for i in s:
        if 'p' == i:
            p += 1
        if 'y' == i:
            y += 1
    
    return p == y