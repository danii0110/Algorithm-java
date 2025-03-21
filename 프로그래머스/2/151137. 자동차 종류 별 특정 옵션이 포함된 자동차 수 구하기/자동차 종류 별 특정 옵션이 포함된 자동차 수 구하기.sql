SELECT CAR_TYPE, COUNT(*) AS CARS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%통풍시트%' OR OPTIONS LIKE '%열선시트%' OR OPTIONS LIKE '%가죽시트%'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE;
# CAR_RENTAL_COMPANY_CAR에서
# '통풍시트', '열선시트', '가죽시트' 중 하나 이상의 옵션이 포함된 자동차가
# '자동차 종류 별'로
# 몇 대인지 출력(CARS)
# 자동차 종류 ASC