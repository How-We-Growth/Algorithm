from itertools import *

def solution(number):
    answer = list(combinations(number, 3))
    counts = 0
    for i in answer:
        if sum(i) == 0:
            counts += 1
    return counts