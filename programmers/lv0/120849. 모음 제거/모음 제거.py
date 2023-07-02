def solution(my_string):
    s = ['a', 'e', 'i', 'o', 'u']
    for i in s:
        if i in my_string:
            my_string = my_string.replace(i, "")
    return my_string