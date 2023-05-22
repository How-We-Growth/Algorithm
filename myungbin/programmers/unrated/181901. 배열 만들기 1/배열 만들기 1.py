def solution(n, k):
    answer = []
    for i in range(1, n+1):
        value = i*k
        if value > n:
            break
        answer.append(value)

    return answer