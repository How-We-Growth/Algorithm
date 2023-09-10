import sys
input = sys.stdin.readline

_min, _max = map(int,input().split())
a = [i**2 for i in range(2,int(_max**0.5)+1)]
num = [1] * (_max-_min+1)
for i in a:
    n = _min//i*i
    while(n < _max+1):
        if n - _min >= 0:
            num[n-_min] = 0
        n += i
print(sum(num))