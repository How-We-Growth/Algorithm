from collections import deque

N = int(input())

board = [[] for _ in range(N+1)]

for _ in range(N):
    temp = list(map(int, input().split()))
    for i in range(1, len(temp)-1, 2):
        board[temp[0]].append((temp[i], temp[i+1]))


def bfs(idx):
    visited = [-1] * (N+1)
    q = deque()
    q.append(idx)
    visited[idx] = 0

    _max = [0, 0]

    while q:
        old = q.popleft()
        for new in board[old]:
            if visited[new[0]] == -1: 
                visited[new[0]] = visited[old] + new[1]
                q.append(new[0])

                if _max[0] < visited[new[0]]:
                    _max[0] = visited[new[0]]
                    _max[1] = new[0]

    return _max

value, node = bfs(1)
answer, node2 = bfs(node)
print(answer)