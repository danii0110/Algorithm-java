# REST_INFO, REST_REVIEW 테이블에서
# '서울'에 위치한 식당들의
# 식당ID, 식당 이름, 음식 종류, 즐겨찾기 수, 주소, 리뷰 평균 점수를 조회
# 리뷰 평균 점수는 소수점 세 번쨰 자리에서 반올림
# 결과는 평균점수를 기준으로 내림차순 정렬
# if) 평균점수가 같다면 즐겨찾기수를 기준으로 내림차순 정렬
SELECT ri.REST_ID, ri.REST_NAME, ri.FOOD_TYPE, ri.FAVORITES, ri.ADDRESS, ROUND(AVG(REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO ri, REST_REVIEW rr
WHERE ADDRESS LIKE'서울%' and ri.REST_ID = rr.REST_ID
GROUP BY ri.REST_ID, ri.REST_NAME, ri.FOOD_TYPE, ri.ADDRESS
ORDER BY SCORE DESC, ri.FAVORITES DESC;