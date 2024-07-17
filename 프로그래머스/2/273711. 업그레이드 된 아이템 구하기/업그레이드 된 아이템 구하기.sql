# 아이템의 희귀도가 'RARE'인 아이템의 '모든 다음 업그레이드 아이템의'
# 아이템 ID, 아이템 명, 아이템의 희귀도 출력
# 아이템 ID를 기준으로 내림차순 정렬
SELECT ii.ITEM_ID, ii.ITEM_NAME, ii.RARITY
FROM ITEM_INFO ii
JOIN ITEM_TREE it
ON ii.ITEM_ID = it.ITEM_ID
WHERE it.PARENT_ITEM_ID IN (SELECT ITEM_ID FROM ITEM_INFO WHERE RARITY = 'RARE')
ORDER BY ii.ITEM_ID DESC;