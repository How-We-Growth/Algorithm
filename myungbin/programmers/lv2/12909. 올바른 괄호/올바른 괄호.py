def solution(s):
    """
    if "("면 bracket에 "(" 추가하고,
    처음 ")"가 나오면 False 
    ")" 가 나올 때 마다 "(" 를 제거 하여 남아있는 "("가 없으면 True 남아 있으면 False  
    """
    bracket = []
    for i in s:
        if i == "(":
            bracket.append(i)
        else:
            if bracket == []:
                return False
            else:
                bracket.pop()
    if bracket == []:
        return True
    else:
        return False