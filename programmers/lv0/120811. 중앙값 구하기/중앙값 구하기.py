import math

def solution(array):
    array.sort()
    length = len(array)
    median = math.ceil(length / 2)
    answer = array[median - 1]
    return answer