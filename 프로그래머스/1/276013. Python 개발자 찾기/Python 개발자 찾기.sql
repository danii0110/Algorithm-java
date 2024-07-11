# DEVELOPER_INFOS 테이블에서
# 'Python' 스킬을 가진 개발자의
# 개발자 ID, 이메일, 이름, 성 조회
# ID를 기준으로 오름차순 정렬
SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPER_INFOS
WHERE 'Python' IN (SKILL_1, SKILL_2, SKILL_3)
ORDER BY ID;