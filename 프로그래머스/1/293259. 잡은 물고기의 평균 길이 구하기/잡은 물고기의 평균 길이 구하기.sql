# 잡은 물고기의 평균 길이를 출력
# 평균 길이 컬럼명: AVERAGE_LENGTH
# 평균 길이는 소수점 3번째 자리에서 반올림
# 10cm 이하의 물고기들은 10cm로 취급하기
SELECT ROUND(AVG(CASE WHEN LENGTH > 10 THEN LENGTH ELSE 10 END), 2) AS AVERAGE_LENGTH
FROM FISH_INFO;