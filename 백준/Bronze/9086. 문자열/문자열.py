# 테스트 케이스의 개수 T 입력받기
# T번 반복하며 문자열 한 줄씩 입력받기
# 각 첫 글자+마지막 글자 출력하기
t = int(input())
for i in range(t):
    s = input()
    print(s[0],s[-1], sep = '')