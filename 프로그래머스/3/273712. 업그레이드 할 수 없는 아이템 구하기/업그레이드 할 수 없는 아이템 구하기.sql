# 더 이상 업그레이드할 수 없는 아이템의
# ITEM_ID, ITEM_NAME, RARITY를 출력
# ITEM_ID를 기준으로 내림차순 정렬
# 업그레이드 불가 기준: ITEM_ID의 값이 PARENT_ITEM_ID 안에 존재하지 않을 경우
SELECT ii.ITEM_ID, ii.ITEM_NAME, ii.RARITY
FROM ITEM_INFO ii
WHERE ii.ITEM_ID NOT IN (
    SELECT it.PARENT_ITEM_ID
    FROM ITEM_TREE it
    WHERE it.PARENT_ITEM_ID IS NOT NULL
)
ORDER BY ii.ITEM_ID DESC;