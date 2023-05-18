def solution(a, b):
    ab = str(a) + str(b) 
    ba = str(b) + str(a) 
    if int(ab) > int(ba):
        answer = int(ab)
    else:
        answer = int(ba)
    return answer