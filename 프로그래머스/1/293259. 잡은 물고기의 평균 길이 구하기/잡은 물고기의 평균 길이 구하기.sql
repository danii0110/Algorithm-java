SELECT ROUND(AVG(COALESCE(IF(LENGTH <= 10, 10, LENGTH), 10)), 2) AS AVERAGE_LENGTH
FROM FISH_INFO;

# FISH_INFO에서
# 평균 길이 출력 -> AVERAGE_LENGTH
# 소수점 3째자리에서 반올림
# 10cm 이하인 물고기들은 10cm로 취급