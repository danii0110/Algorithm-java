# 물고기 '종류 별'로 가장 큰 물고기의
# 물고기 ID, 물고기 이름, 길이 출력
# 물고기 ID: ID, 이름: FISH_NAME, 길이: LENGTH
# 물고기 ID에 대해 오름차순 정렬
# 단, 물고기 종류별 가장 큰 물고기는 1마리만 있음, 10cm 이하의 물고기가 가장 큰 경우는 없음

WITH MaxSizeFish AS (
    SELECT FISH_TYPE, MAX(LENGTH) AS MAX_LENGTH
    FROM FISH_INFO
    GROUP BY FISH_TYPE
)
SELECT ID, FISH_NAME, LENGTH
FROM FISH_INFO fi
JOIN MaxSizeFish msf
ON fi.FISH_TYPE = msf.FISH_TYPE AND fi.LENGTH = msf.MAX_LENGTH
JOIN FISH_NAME_INFO fni
ON fi.FISH_TYPE = fni.FISH_TYPE
ORDER BY fi.ID;