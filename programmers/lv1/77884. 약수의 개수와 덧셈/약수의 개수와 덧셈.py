def solution(left, right):
    answer = []
    for n in range(left, right+1):
        cnt = len([i for i in range(1, n+1) if n % i == 0])
        if cnt % 2 == 0:
            answer.append(n)
        else:
            answer.append(-1*n)
    answer = sum(answer)
    return answer