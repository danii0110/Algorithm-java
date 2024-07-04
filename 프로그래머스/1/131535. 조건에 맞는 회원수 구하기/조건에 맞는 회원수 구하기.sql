# USER_INFO 테이블에서
# '2021'년에 가입한 회원 중
# 나이가 20세 이상 29세 이하인 회원이
# 몇 명인지 출력
SELECT COUNT(USER_ID) AS USERS
FROM USER_INFO
WHERE YEAR(JOINED) = 2021 and AGE >= 20 and AGE <= 29;