def solution(n):
    answer = [int(i) for i in str(n)]
    answer.sort(reverse=True)
    answer = int(''.join([str(i) for i in answer]))
    return answer