# 첫 번째 자연수 입력 받기
# 두 번째 자연수 입력 받기
# 1) 첫 번째 * 두 번째(3)
# 2) 첫 번째 * 두 번째(2)
# 3) 첫 번째 * 두 번째(1)
# 1) + 2)*10 + 3)*100
x = int(input())
y = int(input())
a = x * (y % 10)
b = x * (y % 100 // 10)
c = x * (y // 100)
d = a + 10 * b + 100 * c
print(a)
print(b)
print(c)
print(d)