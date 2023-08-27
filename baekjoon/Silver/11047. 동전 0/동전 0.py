import sys
input = sys.stdin.readline

n, k = map(int, input().split())
a = [0] * n

for i in range(n):
    a[i] = int(input())
    
a.sort(reverse=True)
cnt = 0
for price in a:
    if k >= price:
        cnt += k // price
        k %= price
        if k <= 0:
            break

print(cnt)