SELECT ed.ID, IFNULL(COUNT(ed1.ID), 0) AS CHILD_COUNT
FROM ECOLI_DATA ed
LEFT JOIN ECOLI_DATA ed1
ON ed.ID = ed1.PARENT_ID
GROUP BY ed.ID
ORDER BY ed.ID ASC;

# ECOLI_DATA에서
# ID, 자식의 수 출력
# if) 자식의 수 == NULL -> 0으로 출력
# ID ASC