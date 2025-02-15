SELECT HOUR(DATETIME) AS HOUR, COUNT(*) AS COUNT
FROM ANIMAL_OUTS
WHERE HOUR(DATETIME) BETWEEN '9' AND '19'
GROUP BY HOUR
ORDER BY HOUR ASC;

# ANIMAL_OUTS에서
# 9:00 ~ 19:59까지
# 각 시간대 별 -> 입양이 몇 건 발생했는지 조회
# 시간대 순 ASC