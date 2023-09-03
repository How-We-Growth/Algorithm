import sys
input = sys.stdin.readline

answer = 0
a = list(map(str, input().split("-")))


def custom_sum(value):
    sum = 0
    temp = str(value).split("+")
    for i in temp:
        sum += int(i)
    return sum


for i in range(len(a)):
    temp = custom_sum(a[i])
    if i == 0:
        answer += temp
    else:
        answer -= temp
        

print(answer)
    