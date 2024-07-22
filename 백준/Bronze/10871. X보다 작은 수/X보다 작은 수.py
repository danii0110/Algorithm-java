# N, X 입력받기
# 수열(N개) 입력받기
# X보다 작은 수 출력하기
import sys
n, x = map(int, input().split())
arr = list(map(int, sys.stdin.readline().split()))
for i in arr:
    if (i < x):
        print(i, end = ' ')