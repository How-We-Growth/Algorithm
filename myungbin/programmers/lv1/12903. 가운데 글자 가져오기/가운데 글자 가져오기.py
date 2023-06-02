import math

def solution(s):
    length = len(s)
    if length % 2 == 1:
        answer = s[math.ceil(length/2) - 1]
    else:
        answer = s[length//2-1:length//2+1]
    return answer