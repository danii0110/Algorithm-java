# n 입력받기
# n개의 정수 공백으로 구분하여 입력받기
# 최솟값, 최댓값 출력
import sys
n = int(input())
arr = list(map(int, sys.stdin.readline().split()))
print(min(arr), max(arr))