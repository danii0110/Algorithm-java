# ANIMAL_INS 테이블에서
# 동물의 생물 종, 이름, 성별 & 중성화 여부 조회
# 아이디 순으로 조회
# if) 이름이 NULL일 경우 'No name'으로 출력
SELECT ANIMAL_TYPE, IFNULL(NAME, 'No name'), SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;