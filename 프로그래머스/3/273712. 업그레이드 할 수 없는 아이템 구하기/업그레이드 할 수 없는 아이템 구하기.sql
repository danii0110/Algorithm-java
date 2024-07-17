# ITEM_INFO, ITEM_TREE 테이블에서
# '더 이상 업그레이드할 수 없는' 아이템의
# 아이템 ID, 아이템 명, 아이템의 희귀도 출력
# 아이템 ID를 기준으로 내림차순 정렬
SELECT ii.ITEM_ID, ii.ITEM_NAME, ii.RARITY
FROM ITEM_INFO ii
WHERE ii.ITEM_ID NOT IN (
    SELECT it.PARENT_ITEM_ID
    FROM ITEM_TREE it
    WHERE it.PARENT_ITEM_ID IS NOT NULL
)
ORDER BY ii.ITEM_ID DESC;