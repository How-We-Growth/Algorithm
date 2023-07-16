import sys
input = sys.stdin.readline

n = int(input().strip())
answer = list(map(int, input().split()))

# 정렬
answer.sort()

result = 0

for i in range(n):
    j = 0
    k = n-1
    
    while j < k:  # 두 수가 붙어 있을 경우 까지
        sum_value = answer[j] + answer[k]
        if sum_value == answer[i]:  # 두 수의 합으로 이루어져 있고
            if j != i and k != i:  # j, k가 i와 같지 않으면 => 자기 자신
                result += 1  # 개수 추가
                break
            elif j == i:  
                j += 1
            elif k == i:
                k -= 1
                
        elif sum_value < answer[i]:
            j += 1
            
        else:
            k -= 1
            
print(result)