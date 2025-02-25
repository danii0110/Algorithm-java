SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE') AS TLNO
FROM PATIENT
WHERE AGE <= 12 AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME;
# PATIENT에서
# '12세 이하'인 '여자'환자의
# 환자이름, 성별코드, 나이, 전화번호 조회
# if) 전화번호 없는 경우 -> 'NONE'으로 출력
# 나이 기준 DESC 출력, 나이가 같다면 환자이름 기준 ASC 출력