import sys
input = sys.stdin.readline

n = int(input())

answer = sorted([int(i) for i in str(n)], reverse=True)
answer = ''.join([str(i) for i in answer])
print(answer)
