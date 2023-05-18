def solution(hp):
    ant = [5, 3, 1]
    answer = 0
    for att in ant:
        answer += hp // att
        hp %= att
        if hp == 0:
            break
        
        
    return answer