WITH RECURSIVE GENERATION_CTE AS (
    -- 최초의 1세대 부모를 찾습니다 (PARENT_ID가 NULL인 개체들)
    SELECT ID, 1 AS GENERATION
    FROM ECOLI_DATA
    WHERE PARENT_ID IS NULL
    UNION ALL
    -- 각 부모의 자식들에 대해 세대를 하나씩 증가시켜 연결합니다.
    SELECT E.ID, G.GENERATION + 1
    FROM ECOLI_DATA E
    JOIN GENERATION_CTE G ON E.PARENT_ID = G.ID
)
-- 이제 자식이 없는 개체들을 찾습니다.
SELECT COUNT(*) AS COUNT, GENERATION
FROM GENERATION_CTE G
LEFT JOIN ECOLI_DATA E ON G.ID = E.PARENT_ID
WHERE E.ID IS NULL -- 자식이 없는 개체들
GROUP BY GENERATION
ORDER BY GENERATION ASC;


# ECOLI_DATA에서
# 자식이 없는
# 개체의 수(COUNT), 세대(GENERATION) 출력
# 세대 ASC;