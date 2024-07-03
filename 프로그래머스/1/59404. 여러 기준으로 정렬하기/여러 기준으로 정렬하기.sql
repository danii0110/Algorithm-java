# ANIMAL_INS 테이블을 이용하여
# 모든 동물의 아이디, 이름, 보호 시작일을
# 이름 순으로 조회
# if) 이름이 같다면 보호 시작일 내림차순으로
SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
ORDER BY NAME, DATETIME DESC;