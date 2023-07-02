def solution(strArr):
    for idx, _ in enumerate(strArr):
        if idx % 2 == 0:
            strArr[idx] = strArr[idx].lower()
        else:
            strArr[idx] = strArr[idx].upper()
    return strArr