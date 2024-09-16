SELECT ri.REST_ID, ri.REST_NAME, ri.FOOD_TYPE, ri.FAVORITES, ri.ADDRESS, ROUND(AVG(rr.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO ri, REST_REVIEW rr
WHERE ADDRESS LIKE '서울%' AND ri.REST_ID = rr.REST_ID
GROUP BY ri.REST_ID, ri.REST_NAME, ri.FOOD_TYPE, ri.FAVORITES, ri.ADDRESS
ORDER BY SCORE DESC, FAVORITES DESC;

# REST_INFO, REST_REVIEW 테이블에서
# '서울'에 위치한 식당들의
# 식당ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수 조회
# 리뷰 평균 점수 -> 소수점 세 번째 자리에서 반올림
# 평균점수 DESC, 즐겨찾기수 DESC