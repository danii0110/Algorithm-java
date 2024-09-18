WITH RankedProducts AS (
    SELECT CATEGORY, PRODUCT_NAME, PRICE,
           ROW_NUMBER() OVER (PARTITION BY CATEGORY ORDER BY PRICE DESC) AS rn
    FROM FOOD_PRODUCT
    WHERE CATEGORY IN ('과자', '국', '김치', '식용유')
)
SELECT CATEGORY, PRICE AS MAX_PRICE, PRODUCT_NAME
FROM RankedProducts
WHERE rn = 1
ORDER BY MAX_PRICE DESC;


# FOOD_PRODUCT에서
# 식품분류별로 && 가격이 제일 비싼 식품의
# 분류, 가격, 이름 조회
# 식품분류 = ('과자', '국', '김치', '식용유')만 출력
# 식품 가격 DESC