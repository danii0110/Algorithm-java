# 정수 n 입력받기(정수의 개수)
# 정수들 입력받기(공백으로 구분)
# 정수 v 입력받기(찾으려고 하는 정수)
# v 개수 출력
import sys
n = int(input())
n_list = list(map(int, input().split()))
v = int(input())
print(n_list.count(v))