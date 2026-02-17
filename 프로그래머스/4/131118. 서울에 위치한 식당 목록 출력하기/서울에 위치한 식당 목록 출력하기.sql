SELECT ri.REST_ID, ri.REST_NAME, ri.FOOD_TYPE, ri.FAVORITES, ri.ADDRESS, ROUND(AVG(REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO ri
JOIN REST_REVIEW rr ON ri.REST_ID = rr.REST_ID
WHERE ri.ADDRESS LIKE '서울%'
GROUP BY ri.REST_ID
ORDER BY SCORE DESC, ri.FAVORITES DESC;
# REST_INFO: 식당 정보 // REST_REVIEW: 식당의 리뷰 정보
# REST_ID로 매핑
# 서울에 위치
# 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수를 조회
# 리뷰 평균점수: 소수점 세 번째 자리에서 반올림
# 평균점수 DESC, 즐겨찾기수 DESC