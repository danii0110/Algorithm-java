SELECT MCDP_CD AS '진료과코드', COUNT(*) AS '5월예약건수'
FROM APPOINTMENT
WHERE DATE_FORMAT(APNT_YMD, '%Y-%m') = '2022-05'
GROUP BY MCDP_CD
ORDER BY COUNT(*) ASC, MCDP_CD ASC
# APPOINTMENT에서
# '2022년 5월'에 예약한 '환자의 수'를
# '진료과코드'별로 조회
# 진료과코드 / 5월예약건수
# '진료과별 예약한 환자 수' ASC, '진료과 코드' ASC