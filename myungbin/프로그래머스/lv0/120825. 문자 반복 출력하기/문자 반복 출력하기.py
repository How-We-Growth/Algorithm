def solution(my_string, n):
    answer = []
    for value in my_string:
        answer.append(value*n)
    answer = ''.join(answer)
    return answer