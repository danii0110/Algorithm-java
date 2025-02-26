SELECT ri.FOOD_TYPE, ri.REST_ID, ri.REST_NAME, ri.FAVORITES
FROM REST_INFO ri
WHERE ri.FAVORITES = (
    SELECT MAX(ri2.FAVORITES)
    FROM REST_INFO ri2
    WHERE ri2.FOOD_TYPE = ri.FOOD_TYPE
)
ORDER BY ri.FOOD_TYPE DESC;

# REST_INFO에서
# '음식종류별'로
# '즐겨찾기수'가 '가장 많은' 식당의
# 음식 종류, ID, 식당 이름, 즐겨찾기수 조회
# 음식 종류 DESC