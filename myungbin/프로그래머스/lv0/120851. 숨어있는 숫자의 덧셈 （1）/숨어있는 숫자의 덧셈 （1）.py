import re

def solution(my_string):
    numbers = re.sub(r'[^0-9]', '', my_string)
    answer = 0
    for number in numbers:
        answer += int(number)
    return answer