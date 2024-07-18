# 정수 T 입력받기
# T개 만큼 A, B 입력 받고 A+B 출력
import sys
T = int(input())
for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    print(A + B)