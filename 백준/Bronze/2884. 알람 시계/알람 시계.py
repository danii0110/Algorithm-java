# 정수 H, M 입력받기(시간, 분)
# 45분 더한 시간 출력하기(24시간 표현 사용)
H, M = map(int, input().split())
if (M - 45 < 0):
    if ((H - 1) == 24):
        print(0, (M + 15), sep = ' ')
    elif ((H - 1) < 0):
        print(23, (M + 15), sep = ' ')
    else:
        print((H - 1), (M + 15), sep = ' ')
else:
  print(H, (M - 45), sep=' ')