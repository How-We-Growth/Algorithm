def solution(start, end):
    answer = [i for i in range(end, start+1)]
    answer.sort(reverse=True)
    return answer