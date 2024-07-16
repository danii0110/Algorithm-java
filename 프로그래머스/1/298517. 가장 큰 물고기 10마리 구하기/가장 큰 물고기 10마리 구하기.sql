# FISH_INFO 테이블에서
# 가장 큰 물고기 10마리의 ID, 길이 출력
# 길이 기준으로 내림차순, 물고기 ID 기준 오름차순 정렬
SELECT ID, LENGTH
FROM FISH_INFO
ORDER BY LENGTH DESC, ID ASC
LIMIT 10;