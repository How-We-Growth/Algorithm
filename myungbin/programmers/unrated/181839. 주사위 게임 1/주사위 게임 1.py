def solution(a, b):
    if a % 2 == 1 and b % 2 ==1:
        answer = a*a + b*b
    elif a % 2 == 1 or b % 2 ==1:
        answer = 2*(a + b)
    else:
        answer = abs(a - b)
    return answer