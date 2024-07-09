# 상반기 아이스크림 총주문량이
# 3,000보다 높으면서
# 아이스크림의 주 성분이 과일인 아이스크림의 맛을
# 총주문량이 큰 순서대로 조회
SELECT fh.FLAVOR
FROM FIRST_HALF fh
INNER JOIN ICECREAM_INFO ii
ON fh.FLAVOR = ii.FLAVOR
WHERE TOTAL_ORDER > 3000 and ii.INGREDIENT_TYPE = 'fruit_based'
ORDER BY TOTAL_ORDER DESC;