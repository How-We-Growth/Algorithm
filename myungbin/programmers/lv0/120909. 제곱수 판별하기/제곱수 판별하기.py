def solution(n):
    if n % n**0.5 == 0:
        answer = 1
    else:
        answer = 2
    return answer