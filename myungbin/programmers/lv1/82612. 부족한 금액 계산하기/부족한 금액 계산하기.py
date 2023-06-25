def solution(price, money, count):
    final_price = 0
    for i in range(1, count+1):
        final_price += i*price
    answer = final_price - money
    if answer < 0:
        return 0
    return answer