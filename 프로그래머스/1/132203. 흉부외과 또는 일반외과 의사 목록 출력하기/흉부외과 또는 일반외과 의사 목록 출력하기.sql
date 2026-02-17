SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD IN ('CS', 'GS')
ORDER BY HIRE_YMD DESC, DR_NAME;
# DOCTOR 테이블에서
# 진료과 = 흉부외과(CS), 일반외과(GS)
# 의사의 이름, 의사ID, 진료과, 고용일자를 조회
# 고용일자 DESC, 이름 ASC