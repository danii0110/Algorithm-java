# 수 10개 입력받기(배열에 저장)
# 각각 42로 나눈 나머지 구하기(배열을 순회하며 각각의 나머지 구하기)
# 서로 다른 값 개수 출력(중복 제거하여 count)
arr = [0] * 10
for i in range(10):
    arr[i] = int(input())
    arr[i] %= 42
print(len(set(arr)))