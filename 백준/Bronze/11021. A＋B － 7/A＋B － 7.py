# 개수 T 입력받기
# T만큼 돌면서 A, B 입력받고 출력
import sys
T = int(input())
for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    print('Case #', (i + 1), ': ', (A + B), sep = '')