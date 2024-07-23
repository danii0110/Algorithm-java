# n, m 입력받기(n: 바구니 개수, m: 공 바꾸려는 횟수)
# m번 돌면서
n, m = map(int, input().split())
arr = [0] * n
for i in range(n):
    arr[i] = (i + 1)
for i in range(m):
    i, j = map(int, input().split())
    arr[i-1], arr[j-1] = arr[j-1], arr[i-1]
for i in arr:
  print(i, end = ' ')