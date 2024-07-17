# 정수 T(개수) 입력바기
# T만큼 돌면서 A, B 입력받기
# A + B 출력
T = int(input())
for i in range(T):
    A, B = map(int, input().split())
    print(A + B)