import sys
input = sys.stdin.readline

n = int(input())
x = [int(input()) for _ in range(n)]

for i in sorted(x):
    print(i)