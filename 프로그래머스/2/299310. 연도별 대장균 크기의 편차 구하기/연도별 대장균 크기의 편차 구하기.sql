# ECOLI_DATA 테이블에서
# 분화된 연도, 분화된 연도별 대장균 크기의 편차, 대장균 개체의 ID 출력
# 분화된 연도별 대장균 크기의 편차: 분화된 연도별 가장 큰 대장균의 크기 - 각 대장균의 크기
# 연도에 대해 오름차순, 대장균 크기의 편차에 대해 오름차순
WITH MaxSizePerYear AS (
    SELECT YEAR(DIFFERENTIATION_DATE) AS YEAR, MAX(SIZE_OF_COLONY) AS MAX_SIZE
    FROM ECOLI_DATA
    GROUP BY YEAR
)
SELECT m.YEAR, (m.MAX_SIZE - e.SIZE_OF_COLONY) AS YEAR_DEV, e.ID
FROM ECOLI_DATA e
LEFT JOIN MaxSizePerYear m
ON YEAR(DIFFERENTIATION_DATE) = m.YEAR
ORDER BY m.YEAR, YEAR_DEV;