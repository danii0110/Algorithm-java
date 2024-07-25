# 정수 T 입력받기(테스트 케이스의 개수)
# T번 반복
# 반복 횟수 R, 문자열 S 입력받기
# 출력
t = int(input())
for _ in range(t):
    p = []
    r, s = map(str, input().split())
    for char in s:
      p.append(char * int(r))
    print(''.join(p))