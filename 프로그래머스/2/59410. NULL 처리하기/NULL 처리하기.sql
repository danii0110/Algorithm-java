SELECT ANIMAL_TYPE, IFNULL(NAME, 'No name'), SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY ANIMAL_ID ASC;

# ANIMAL_INS에서
# 생물 종, 이름, 성별 및 중성화 여부 조회
# ID ASC
# if) 이름 == NULL -> 'No name'으로 출력