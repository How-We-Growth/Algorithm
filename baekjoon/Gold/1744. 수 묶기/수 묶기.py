import sys
input = sys.stdin.readline

n = int(input())

plus = []
minus = []

result = 0
for i in range(n):
    num = int(input())
    if num > 1:
        plus.append(num)
    elif num <= 0:
        minus.append(num)
    else:
        result += num

# 정렬
plus.sort(reverse=True)
minus.sort()

if len(plus) % 2 != 0:
    plus.append(1)
if len(minus) % 2 != 0:
    minus.append(1)
for i in range(0, len(plus), 2):
    result += (plus[i]*plus[i+1])
for i in range(0, len(minus), 2):
    result += (minus[i]*minus[i+1])
print(result)
