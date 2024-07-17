# 정수 3개 입력 받기
# 같은 눈 개수 구하기
# 결과 출력
x, y, z = map(int, input().split())
count = 0
if x==y:
    if x==z:
        count = 3
    else:
        count = 2
        z = x
else:
    if x==z or y==z:
        count = 2
    else:
        if x >= y >= z or x >= z >= y:
            z = x
        elif y >= x >= z or y >= z >= x:
            z = y
        elif z >= x >= y or z >= y >= z:
            z = z

if count == 3:
    print(10000 + z * 1000)
elif count == 2:
    print(1000 + z * 100)
else:
    print(z * 100)