def solution(num_list):
    even = len([e for e in num_list if e % 2 == 0])
    odd = len([o for o in num_list if o % 2 == 1])
    return [even, odd]