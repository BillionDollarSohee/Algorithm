-- 코드를 입력하세요
SELECT DATE_FORMAT(O.SALES_DATE, '%Y') AS YEAR , MONTH(SALES_DATE) AS MONTH , U. GENDER, COUNT(DISTINCT(U.USER_ID)) AS USERS 
FROM USER_INFO U JOIN ONLINE_SALE O
ON U.USER_ID = O.USER_ID
WHERE U.GENDER IS NOT NULL
GROUP BY MONTH, GENDER 
ORDER BY 1,2,3;
