# 숫자 3개 입력 받고
# 차례대로 계산 후 출력하기
a, b, c = map(int, input().split())
print((a+b)%c)
print(((a%c) + (b%c))%c)
print((a*b)%c)
print(((a%c) * (b%c))%c)