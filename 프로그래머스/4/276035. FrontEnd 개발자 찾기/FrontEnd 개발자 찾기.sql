# 1. SKILLCODES 테이블에서 CATEGORY = 'Front End' 인 CODE들을 모은다
#    → front_end_codes = [16, 2048, 8192]  (예시 기준)

# 2. DEVELOPERS 테이블의 각 개발자에 대해:
#    for each developer in DEVELOPERS:
#        skill_code = developer.SKILL_CODE   // 예: 400, 2048, 8452 ...

#        is_front_end = false
#        for each code in front_end_codes:
#            if (skill_code BIT_AND code) > 0:   // 그 비트가 켜져 있는지 확인
#                is_front_end = true
#                break

#        if is_front_end:
#            결과에 developer.ID, EMAIL, FIRST_NAME, LAST_NAME 추가

# 3. 결과를 ID 기준 오름차순 정렬

SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS
WHERE DEVELOPERS.SKILL_CODE & (SELECT SUM(CODE) FROM SKILLCODES WHERE CATEGORY = 'Front End') > 0
ORDER BY ID

