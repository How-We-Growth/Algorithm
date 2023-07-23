import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
queue = deque()

for i in range(1, n+1):
    queue.append(i)
    
while len(queue) > 1:  # 큐의 개수가 1이 될 때 까지
    queue.popleft()  # 첫번째 큐 지우기
    queue.append(queue.popleft())  # 마지막 큐를 첫번째 큐에 넣기
    
print(queue[0])