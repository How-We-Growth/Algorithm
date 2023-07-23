import sys
input = sys.stdin.readline

n = int(input())
a = [int(input()) for _ in range(n)]

stack = []
num = 1
result = True
answer = ""

for idx in range(n):  # n까지
    s = a[idx]  # 첫번째 index
    if s >= num:  # index 번째의 수가 num보다 크거나 같으면
        while s >= num:  # 크거나 같을 때까지
            stack.append(num)  # append 
            num += 1  # 한개씩 늘리기
            answer += "+\n"
        stack.pop()  # 끝나면 pop
        answer += "-\n"
    else:  # 작으면 pop 
        n = stack.pop()
        
        if n > s:
            print("NO")
            result = False
            break
        else:
            answer += "-\n"

if result:
    print(answer)
        
    