# Book 테이블에서
# '2021년'에 출판된
# '인문' 카테고리에 속하는 도서 리스트를 찾아서
# 도서 ID(BOOK_ID), 출판일(PUBLISHED_DATE)을 출력
# 출판일을 기준으로 오름차순 정렬
SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK
WHERE YEAR(PUBLISHED_DATE) = '2021' and CATEGORY = '인문'
ORDER BY PUBLISHED_DATE;