# N, M 입력받기(N: 바구니의 개수&번호, M: 역순 횟수)
n, m = map(int, input().split())
arr = list(range(1, n + 1))
for i in range(m):
    x, y = map(int, input().split())
    arr[x-1:y] = arr[x-1:y][::-1]
print(*arr)