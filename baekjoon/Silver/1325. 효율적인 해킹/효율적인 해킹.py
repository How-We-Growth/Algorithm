import sys
from collections import deque
input = sys.stdin.readline

N, M = map(int, input().split())
graph = [[] for _ in range(N+1)]

for _ in range(M):
    A, B = map(int, input().split())
    graph[B].append(A)


def bfs(start) -> int:
    counts = 0
    queue = deque([start])
    visited[start] = True
    
    while queue:
        node = queue.popleft()
        for i in graph[node]:
            if not visited[i]:
                queue.append(i)
                counts += 1
                visited[i] = True
    return counts
    
answer = [0 for _ in range(N+1)]         
for i in range(1, N+1):
    visited = [False] * (N + 1)
    answer[i] = bfs(i)

for i in range(1, N+1):
    if answer[i] == max(answer):
        print(i, end=' ')