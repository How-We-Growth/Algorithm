import sys
from collections import deque
input = sys.stdin.readline

n, m = map(int, input().split())
graph = [[] for i in range(n+1)]

for i in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)
    
def bfs(start):
    queue = deque([start])
    visited[start] = 1
    while queue:
        node = queue.popleft()
        
        for i in graph[node]:
            if not visited[i]:
                visited[i] = visited[node] + 1
                queue.append(i)

kb = []                

for i in range(1, n+1):
    visited = [0] * (n+1)
    bfs(i)
    kb.append(sum(visited))
    

print(kb.index(min(kb)) + 1)