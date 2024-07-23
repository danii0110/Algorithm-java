# N, M 입력받기(바구니 N개, 공 N번, 행동 M번)
# M번 반복(i, j, k 입력받기)
# (i~j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣음)
n, m = map(int, input().split())
arr = [0] * n
for x in range(m):
    i, j, k = map(int, input().split())
    for y in range((i - 1), j):
      arr[y] = k
for i in arr:
  print(i, end = ' ')