import sys

input = sys.stdin.readline

n = int(input())
k = int(input())


start = 1
end = k
ans = 0


while start <= end:
    middle = int((start+end)/2)
    cnt = 0
    
    for i in range(1, n+1):
        cnt += min(int(middle/i),n)
        
    if cnt < k:
        start = middle + 1
    else:
        end = middle - 1
        ans = middle
        
print(ans)
        