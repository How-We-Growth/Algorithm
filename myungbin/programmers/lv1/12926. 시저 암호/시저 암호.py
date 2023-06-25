from string import ascii_lowercase, ascii_uppercase

def solution(s, n):
    
    alphabet_lower = list(ascii_lowercase)
    alphabet_upper = list(ascii_uppercase)
    
    answer = []
    for string in s:
        if string in alphabet_lower:
            idx = alphabet_lower.index(string) + n
            answer.append(alphabet_lower[idx%26])
        elif string in alphabet_upper:
            idx = alphabet_upper.index(string) + n
            answer.append(alphabet_upper[idx%26])
        else:
            answer.append(" ")
            
    return "".join(answer)