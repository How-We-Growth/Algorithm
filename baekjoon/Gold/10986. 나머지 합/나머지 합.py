import sys
input = sys.stdin.readline

n, m = map(int, input().split())
A = list(map(int, input().split()))

temp = 0
prefix_num = []
remember = [0] * m

for i in A:
    temp = temp+i
    prefix_num.append(temp)

answer = 0
for i in range(n):
    remain = prefix_num[i] % m
    if remain == 0:
        answer += 1
    remember[remain] += 1

for i in range(m):
    if remember[i] > 1:
        answer += (remember[i] * (remember[i]-1) //2)

print(answer)
