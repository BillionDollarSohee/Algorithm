SELECT H.EMP_NO, H.EMP_NAME, B.GRADE, CASE
                                           WHEN B.GRADE = 'S' THEN H.SAL * 0.2
                                           WHEN B.GRADE = 'A' THEN H.SAL * 0.15
                                           WHEN B.GRADE = 'B' THEN H.SAL * 0.1
                                           ELSE H.SAL * 0
                                       END AS BONUS
FROM HR_EMPLOYEES H
JOIN
(SELECT EMP_NO,
       CASE
           WHEN AVG(SCORE) >= 96 THEN 'S'
           WHEN AVG(SCORE) >= 90 THEN 'A'
           WHEN AVG(SCORE) >= 80 THEN 'B'
           ELSE 'C'
       END AS GRADE
FROM HR_GRADE
GROUP BY EMP_NO) B
ON H.EMP_NO = B.EMP_NO
ORDER BY EMP_NO