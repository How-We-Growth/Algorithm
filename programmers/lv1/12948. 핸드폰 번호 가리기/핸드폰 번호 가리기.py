def solution(phone_number):
    length = len(phone_number[:-4])
    answer = phone_number.replace(phone_number[:-4], "*"*length)
    return answer