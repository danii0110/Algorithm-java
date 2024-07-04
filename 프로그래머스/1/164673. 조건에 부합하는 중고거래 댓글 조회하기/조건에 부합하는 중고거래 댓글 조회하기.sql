# USED_GOODS_BOARD, USED_GOODS_REPLY 테이블에서
# '2022-10'에 작성된
# 게시글 제목, 게시글ID, 댓글ID, 댓글 작성자ID, 댓글 내용, 댓글 작성일 조회
# 댓글 작성일으르 기준으로 오름차순 정렬
# if) 댓글 작성일이 같다면 게시글 제목을 기준으로 오름차순 정렬
# 날짜 형식 주의
SELECT ugb.TITLE, ugb.BOARD_ID, ugr.REPLY_ID, ugr.WRITER_ID, ugr.CONTENTS, DATE_FORMAT(ugr.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD ugb, USED_GOODS_REPLY ugr
WHERE DATE_FORMAT(ugb.CREATED_DATE, '%Y-%m') = '2022-10' and ugb.BOARD_ID = ugr.BOARD_ID
ORDER BY ugr.CREATED_DATE, ugb.TITLE;