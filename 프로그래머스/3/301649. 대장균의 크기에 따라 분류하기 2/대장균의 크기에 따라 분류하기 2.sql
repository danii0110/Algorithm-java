WITH Ranked_Ecoli AS (
    SELECT
        ID,
        SIZE_OF_COLONY,
        NTILE(4) OVER (ORDER BY SIZE_OF_COLONY DESC) AS tile_rank
    FROM ECOLI_DATA
)
SELECT
    ID,
    CASE
        WHEN tile_rank = 1 THEN 'CRITICAL'
        WHEN tile_rank = 2 THEN 'HIGH'
        WHEN tile_rank = 3 THEN 'MEDIUM'
        ELSE 'LOW'
    END AS COLONY_NAME
FROM Ranked_Ecoli
ORDER BY ID ASC;

# ECOLI_DATA에서
# ID, 분류된 이름(COLONY_NAME) 출력
# ID ASC