def solution(n):
    value = divmod(n, 7)
    if value[1] != 0:
        answer = value[0] + 1
    else:
        answer = value[0]
    return answer