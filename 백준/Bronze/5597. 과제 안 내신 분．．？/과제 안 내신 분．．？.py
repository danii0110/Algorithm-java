# 모든 학생의 출석번호 리스트 생성
students = list(range(1, 31))

# 28명의 제출한 학생 출석번호 입력
for _ in range(28):
    submitted = int(input())
    students.remove(submitted)

# 제출하지 않은 학생 번호 출력 (오름차순으로 이미 정렬된 상태)
for student in students:
    print(student)
