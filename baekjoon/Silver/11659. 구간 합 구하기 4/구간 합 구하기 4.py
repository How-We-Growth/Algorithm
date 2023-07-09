import sys
input = sys.stdin.readline

n, m = map(int, input().split())
numbers = list(map(int, input().split()))
temp = 0
sum_list = [0]

for i in numbers:
    temp = temp+i
    sum_list.append(temp)
    

for i in range(m):
    s, e = map(int, input().split())
    print(sum_list[e] - sum_list[s-1])