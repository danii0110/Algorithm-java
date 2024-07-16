# 정수 x 입력받기
# 정수 y 입력받기
# 사분면 번호 출력하기
x = int(input())
y = int(input())
if (x > 0 and y > 0):
    print(1)
elif (x < 0 and y > 0):
    print(2)
elif (x < 0 and y < 0):
    print(3)
elif (x > 0 and y < 0):
    print(4)