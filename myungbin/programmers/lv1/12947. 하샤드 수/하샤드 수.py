def solution(x):
    answer = [int(i) for i in str(x)]
    if x % sum(answer) == 0:
        answer = True
    else:
        answer = False
    return answer