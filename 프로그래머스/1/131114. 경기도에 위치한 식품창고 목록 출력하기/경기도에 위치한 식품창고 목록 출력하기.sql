# FOOD_WAREHOUSE 테이블에서
# '경기도'에 위치한
# 창고의 ID, 이름, 주소, 냉동시설 여부 조회
# if) 냉동시설 여부가 null => 'N'으로 출력
# 창고 ID를 기준으로 오름차순 정렬
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, IFNULL(FREEZER_YN, 'N')
FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE '경기도%'
ORDER BY WAREHOUSE_ID;