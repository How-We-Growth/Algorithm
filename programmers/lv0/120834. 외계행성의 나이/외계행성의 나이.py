def solution(age):
    alphaList = [chr(c) for c in range(ord('a'), ord('z')+1)]
    age = list(str(age))
    answer = ''
    for i in age:
        answer += alphaList[int(i)]
    return answer