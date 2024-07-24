# M: 본인 점수 중 최댓값
# 모든 점수를 점수/M*100으로 고침
# 새로운 평균 구하기

# N 입력받기(시험 본 과목의 개수)
# 현재 성적 N개 입력받아 배열에 저장
n = int(input())
arr = list(map(int, input().split()))
m = max(arr)
for i in range(n):
    arr[i] = arr[i] / m * 100
print(sum(arr) / len(arr))
    