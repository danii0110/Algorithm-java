# ANIMAL_INS 테이블에서
# 동물의 이름이 몇 개인지 조회
# 이름이 NULL인 경우는 집계 x
# 중복 제거
SELECT COUNT(DISTINCT NAME)
FROM ANIMAL_INS
WHERE NAME IS NOT NULL;