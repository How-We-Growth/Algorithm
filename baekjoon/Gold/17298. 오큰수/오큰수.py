import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
stack = []
answer = [-1]*n

for i in range(n):
    # 스택이 비어있지 않고, 스택의 가장 위에 있는 원소의 값이 현재 원소보다 작을 때까지 
    while stack and a[stack[-1]] < a[i]:
        # 스택의 가장 위에 있는 원소가 현재 원소보다 작다면, 해당 원소의 오큰수를 현재 원소로 갱신하고 스택에서 해당 원소를 제거
        answer[stack.pop()] = a[i]
    stack.append(i)
    
print(*answer)        