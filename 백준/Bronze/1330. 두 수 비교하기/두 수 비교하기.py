# 두 정수 입력 받기(공백 한 칸으로 구분)
# > < == 출력
a, b = map(int, input().split())
if (a > b):
    print('>')
elif (a == b):
    print('==')
else:
    print('<')