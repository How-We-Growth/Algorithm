import sys
input = sys.stdin.readline

n = int(input())
m = int(input())
answer = list(map(int, input().split()))

# 정렬
answer.sort()

counts = 0
i = 0
j = n-1

while i < j:
    if answer[i] + answer[j] < m:
        i += 1
    elif answer[i] + answer[j] > m:
        j -= 1
    else:
        counts += 1
        i += 1
        j -= 1

print(counts)