import sys
from collections import deque
input = sys.stdin.readline

N, M, K, X = map(int, input().split())
graph = [[] for _ in range(N+1)]
answer = []
visited = [-1] * (N + 1)

for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)

def bfs(start):
    queue = deque([start])
    visited[start] += 1

    while queue:
        v = queue.popleft()
        
        for i in graph[v]:
            if visited[i] == -1:
                visited[i] = visited[v] + 1
                queue.append(i)

bfs(X)

for i in range(N+1):
    if visited[i] == K:
        answer.append(i)


if not answer:
    print(-1)
else:
    answer.sort()
    for i in answer:
        print(i)