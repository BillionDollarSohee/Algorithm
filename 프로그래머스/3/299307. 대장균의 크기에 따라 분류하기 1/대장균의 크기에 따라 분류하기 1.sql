# 조건은 위에서부터 순서대로 검사돼요. 첫 번째 WHEN이 참이면 그 아래는 검사 안 하고 바로 그 값을 씁니다. 
# 그래서 "100 이하" 다음에 "1000 이하"라고만 써도 되는 거예요 (이미 100 이하는 위에서 걸러졌으니까).
# 100 초과 1000 이하를 굳이 SIZE_OF_COLONY > 100 AND SIZE_OF_COLONY <= 1000이라고 다 쓸 필요 없이, 위 순서대로 쌓는 CASE 구조를 쓰면 두 번째 조건은 그냥 <= 1000만 써도 충분해요.
# 마지막 ELSE는 남은 경우(1000 초과)를 처리합니다.
# AS SIZE처럼 별칭(alias)을 꼭 붙여줘야 결과 컬럼명이 문제에서 요구하는 SIZE로 나옵니다.
# 정렬은 이전 문제와 똑같이 ORDER BY ID 뒤에 오름차순 키워드.

SELECT ID, (CASE
    WHEN SIZE_OF_COLONY <= 100 THEN 'LOW'
    WHEN SIZE_OF_COLONY <= 1000 THEN 'MEDIUM'
    ELSE 'HIGH'
           END) AS SIZE
FROM ECOLI_DATA
ORDER BY ID ASC;