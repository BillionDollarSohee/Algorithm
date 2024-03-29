-- 코드를 입력하세요
SELECT ANIMAL_ID, ANIMAL_TYPE, NAME
FROM ANIMAL_INS
WHERE SEX_UPON_INTAKE IN ('Intact Female', 'Intact Male')
INTERSECT
SELECT ANIMAL_ID, ANIMAL_TYPE, NAME
FROM ANIMAL_OUTS
WHERE SEX_UPON_OUTCOME IN ('Spayed Female', 'Spayed Male','Neutered Female', 'Neutered Male');