SELECT COUNT(ID) AS COUNT
FROM ECOLI_DATA
WHERE (GENOTYPE & 2) = 0 -- 2번 형질을 보유하지 않음
  AND ((GENOTYPE & 1) = 1 OR (GENOTYPE & 4) = 4) -- 1번 형질 또는 3번 형질을 보유