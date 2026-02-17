SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE') AS TLNO
FROM PATIENT
WHERE AGE <= 12 and GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME ASC;
# PATIENT 테이블에서
# 12세 이하인 여자환자의
# 환자이름, 환자번호, 성별코드, 나이, 전화번호 조회
# 전화번호가 없는 경우 -> 'NONE'으로 출력
# 나이 DESC, 환자이름 ASC