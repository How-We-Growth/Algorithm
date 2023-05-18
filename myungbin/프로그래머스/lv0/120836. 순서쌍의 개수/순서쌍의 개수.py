def solution(n):
    answer = []
    counts = 0
    for i in range(1, n+1):
        if n % i == 0:
            answer.append(i)
    for i in answer:
        for j in answer:
            if i*j == n:
                counts += 1
    return counts