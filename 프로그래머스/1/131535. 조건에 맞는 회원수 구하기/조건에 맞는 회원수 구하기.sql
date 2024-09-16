SELECT COUNT(*)
FROM USER_INFO
WHERE DATE_FORMAT(JOINED, '%Y') = 2021 AND AGE >= 20 AND AGE <= 29;

# USER_INFO에서
# '2021'년에 가입한 회원 중
# 나이 >= 20 && 나이 <= 29인 회원이
# 몇 명인지 출력