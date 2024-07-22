# 9개의 자연수 입력받기(한 줄에 하나)
# 최댓값 출력
# 최댓값 위치 출력
arr = [0] * 9
for i in range(9):
    arr[i] = int(input())
print(max(arr), arr.index(max(arr)) + 1, sep = '\n')