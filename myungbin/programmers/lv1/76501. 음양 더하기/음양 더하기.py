def solution(absolutes, signs):
    result = []
    for i in zip(absolutes, signs):
        if i[1] == False:
            result.append(-1*i[0])
        else:
            result.append(i[0])
    answer = sum(result)
    return answer