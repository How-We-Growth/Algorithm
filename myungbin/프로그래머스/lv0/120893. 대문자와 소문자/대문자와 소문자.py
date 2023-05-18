def solution(my_string):
    string = []
    for i in my_string:
        if i.isupper():
            string.append(i.lower())
        else:
            string.append(i.upper())
    answer = "".join(string)
    return answer