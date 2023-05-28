def solution(seoul):
    for idx, value in enumerate(seoul):
        if value == "Kim":
            answer = f"김서방은 {idx}에 있다"
    return answer
