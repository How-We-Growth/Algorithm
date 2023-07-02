def solution(sides):
    sides.sort(reverse=True)
    other = sides[1] + sides[2]
    if  other > sides[0]:
        return 1
    else:
        return 2