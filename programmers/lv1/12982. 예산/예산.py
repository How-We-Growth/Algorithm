def solution(d, budget):
    d.sort()
    for i in range(1, len(d)+1):
        d_sum = d[:i]
        if sum(d_sum) > budget:
            answer = len(d_sum) - 1
            break
        if sum(d_sum) == budget:
            answer = len(d_sum)
            break
        else:
            answer = len(d_sum)
    return answer
