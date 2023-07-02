def solution(numbers, direction):
    if direction == 'right':
        value = numbers.pop()
        numbers.insert(0, value)
    else:
        value = numbers.pop(0)
        numbers.append(value)
    return numbers