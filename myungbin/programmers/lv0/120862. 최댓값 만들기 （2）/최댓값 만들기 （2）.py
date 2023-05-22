def solution(number):
    number.sort()
    answer = max(number[0]*number[1], number[-1]*number[-2])

    return answer