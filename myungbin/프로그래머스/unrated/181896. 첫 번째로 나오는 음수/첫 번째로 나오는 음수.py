def solution(num_list):
    answer = -1
    for idx, value in enumerate(num_list):
        if value < 0:
            return idx
    return answer