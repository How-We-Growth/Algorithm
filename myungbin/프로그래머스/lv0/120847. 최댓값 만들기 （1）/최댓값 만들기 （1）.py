def solution(numbers):
    max_num = max(numbers)
    numbers.remove(max_num)
    max_num2 = max(numbers)
    answer = max_num * max_num2
    return answer