def solution(n, k):
    sheep = n*12000
    drink = k*2000
    service = n//10
    
    answer = sheep + drink - (service*2000)
    return answer