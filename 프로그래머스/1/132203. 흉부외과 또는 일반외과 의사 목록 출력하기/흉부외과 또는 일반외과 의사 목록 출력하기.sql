SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD = 'CS' || MCDP_CD = 'GS'
ORDER BY HIRE_YMD DESC, DR_NAME;
# DOCTOR에서
# 진료과가 흉부외과(CS) || 일반외과(GS)인 의사의
# 의사이름, 의사ID, 진료과, 고용일자 조회
# 고용일자 DESC, 의사이름 ASC