# 현재 시각 입력받기(시, 분 / 공백 구분)
# 소요 시간 입력받기
# 계산 후 출력하기
A, B = map(int, input().split())
C = int(input())
B += C
if (B >= 60):
    if((A + (B // 60)) >= 24):
      print((A + (B // 60) - 24), (B - (B // 60) * 60), sep = ' ')
    else:
      print((A + (B // 60)), (B - (B // 60) * 60), sep = ' ')
else:
    print(A, B, sep = ' ')