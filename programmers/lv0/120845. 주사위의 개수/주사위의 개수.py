def solution(box, n):
    answer = 1
    for i in range(len(box)):
        count = box[i]//n
        answer *= count
    return answer