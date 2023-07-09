n = input()
score_list = list(map(int, input().split()))

max_score = max(score_list)
print(sum([(i/max_score)*100 for i in score_list]) / len(score_list))