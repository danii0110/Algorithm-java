SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK
WHERE DATE_FORMAT(PUBLISHED_DATE, '%Y') = '2021' && CATEGORY = '인문'
ORDER BY PUBLISHED_DATE;
# BOOK에서
# '2021년'에 출판 && '인문' 도서를 찾아서
# 도서ID, 출판일 출력
# 출판일 ASC