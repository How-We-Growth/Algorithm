def solution(num_list):
    answer = 1
    for i in num_list:
        answer *= i
    if answer > sum(num_list)**2:
        result = 0
    else:
        result = 1
    return result