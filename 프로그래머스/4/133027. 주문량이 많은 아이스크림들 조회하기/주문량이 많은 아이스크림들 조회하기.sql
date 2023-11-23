SELECT F.FLAVOR
FROM FIRST_HALF F,
    (SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOTAL
    FROM JULY
    GROUP BY FLAVOR) AS J
WHERE F.FLAVOR = J.FLAVOR
ORDER BY (TOTAL + TOTAL_ORDER) DESC
LIMIT 3;


