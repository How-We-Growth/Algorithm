import sys
from queue import PriorityQueue
input = sys.stdin.readline


n = int(input())
pq = PriorityQueue()
for _ in range(n):
    data = int(input())
    pq.put(data)
    
data1 = 0
data2 = 0
sum_ = 0

while pq.qsize() > 1:
    data1 = pq.get()  # 작은거 1
    data2 = pq.get()  # 작은거 2
    temp = data1 + data2 
    sum_ += temp
    pq.put(temp)
    
print(sum_)