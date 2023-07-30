import sys
input = sys.stdin.readline

n = int(input())
p = list(map(int, input().split()))
p = sorted(p)

answer = []
num = 0
for i in p:
    num += i
    answer.append(num)
   
print(sum(answer))
    
