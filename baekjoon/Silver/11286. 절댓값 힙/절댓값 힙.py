import sys
import heapq
input = sys.stdin.readline

n = int(input())
x = [int(input()) for _ in range(n)]
heap = []

for idx in range(n):
    num = x[idx]
    
    if num == 0:
        if heap:
            print(heapq.heappop(heap)[1])
        else:
            print(0)
    else:
        heapq.heappush(heap, (abs(num), num))