SELECT e3.ID
FROM ECOLI_DATA e1
JOIN ECOLI_DATA e2 ON e2.PARENT_ID = e1.ID
JOIN ECOLI_DATA e3 ON e3.PARENT_ID = e2.ID
WHERE e1.PARENT_ID IS NULL
ORDER BY e3.ID ASC;

# ECOLI_DATA에서
# '3세대' 대장균의
# ID 출력
# ID ASC;