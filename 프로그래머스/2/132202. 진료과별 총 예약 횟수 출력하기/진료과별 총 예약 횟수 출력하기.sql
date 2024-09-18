SELECT MCDP_CD AS '진료과코드', COUNT(*) AS '5월예약건수'
FROM APPOINTMENT
WHERE YEAR(APNT_YMD) = 2022 AND MONTH(APNT_YMD) = 5
GROUP BY MCDP_CD
ORDER BY COUNT(*) ASC, MCDP_CD ASC;

# APPOINTMENT에서
# '2022-05'에 예약한 환자 수를
# 진료과코드 별로 조회 -> '진료과코드', 진료과코드 별 예약한 환자 수 -> '5월예약건수'
# 5월예약건수 ASC, 진료과 코드 ASC