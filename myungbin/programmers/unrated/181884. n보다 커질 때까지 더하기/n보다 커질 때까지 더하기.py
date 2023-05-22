def solution(numbers, n):
    sum = 0
    for i in numbers:
        sum += i
        if sum > n:
            answer = sum
            break
    return answer