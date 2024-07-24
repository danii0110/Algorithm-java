# 숫자의 개수 N개 입력받기
# N개의 숫자 입력받기
# N개의 숫자의 합 출력하기
n = int(input())
s = input()
sum = 0
for i in range(n):
  sum += int(s[i])
print(sum)