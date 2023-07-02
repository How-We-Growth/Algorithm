def solution(num_list):
    even = [str(i) for i in num_list if i%2 == 0]
    odd = [str(i) for i in num_list if i%2 == 1]

    ev, od = '', ''
    for i in even:
        ev += i
    for j in odd:
        od += j

    answer = int(ev) + int(od)

    return answer