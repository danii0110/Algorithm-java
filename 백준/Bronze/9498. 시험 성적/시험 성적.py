# 정수 입력 받기
# 조건에 맞게 성적 출력하기
score = int(input())
if (90 <= score <= 100):
    print('A')
elif (80 <= score):
    print('B')
elif (70 <= score):
    print('C')
elif (60 <= score):
    print('D')
else :
    print('F')