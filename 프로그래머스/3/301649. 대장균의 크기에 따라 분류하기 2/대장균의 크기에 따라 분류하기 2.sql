SELECT ID, 
        CASE
            WHEN RATIO <= 0.25 THEN 'CRITICAL'
            WHEN RATIO <= 0.5  THEN 'HIGH'
            WHEN RATIO <= 0.75 THEN 'MEDIUM'
            ELSE 'LOW'
        END AS COLONY_NAME
  FROM 
        (SELECT ID, (SELECT COUNT(*)
                       FROM ECOLI_DATA
                      WHERE SIZE_OF_COLONY >= E.SIZE_OF_COLONY) /
                    (SELECT COUNT(*)
                        FROM ECOLI_DATA) AS RATIO
          FROM ECOLI_DATA E) T
 ORDER BY ID;         