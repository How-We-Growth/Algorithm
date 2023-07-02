import numpy as np

def solution(arr):
    if len(arr) == 1:
        return [-1]
    del arr[np.argmin(arr)]
    answer = arr
    return answer