def solution(a, b):
    answer = sum([i for i in range(min(a, b), max(a, b)+1)])
    return answer