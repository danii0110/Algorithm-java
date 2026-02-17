SELECT fh.FLAVOR
FROM FIRST_HALF fh
JOIN ICECREAM_INFO ii ON fh.FLAVOR = ii.FLAVOR
WHERE fh.TOTAL_ORDER > 3000 and ii.INGREDIENT_TYPE = 'fruit_based'
ORDER BY fh.TOTAL_ORDER DESC;
# FIRST_HALF 테이블 / ICECREAM_INFO 테이블
# 총주문량이 3,000보다 높으면서 && 아이스크림의 주 성분이 과일
# 아이스크림 맛 출력
# 총주문량 DESC