# 영수증 가격 X 입력받기
# 물건 수 N 입력받기
# N개 돌면서 가격 a, 개수 b 입력받기(공백 기준)
# 계산 후 X와 비교(Yes, No 출력)

X = int(input())
N = int(input())
total = 0
for i in range(N):
    a, b = map(int, input().split())
    total += a * b
if(total == X):
    print('Yes')
else:
    print('No')