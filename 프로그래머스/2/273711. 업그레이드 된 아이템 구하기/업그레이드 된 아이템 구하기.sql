SELECT
    CHILD.ITEM_ID         /* 자식 아이템 ID */
  , CHILD.ITEM_NAME       /* 자식 아이템 이름 */
  , CHILD.RARITY          /* 자식 아이템 희귀도 */
  FROM ITEM_INFO PARENT   /* RARE 필터링용 부모 정보 */
  JOIN ITEM_TREE TREE
    ON PARENT.ITEM_ID = TREE.PARENT_ITEM_ID     /* 부모의 ID가 TREE의 PARENT_ITEM_ID와 같은 행 찾기 */
  JOIN ITEM_INFO CHILD
    ON TREE.ITEM_ID = CHILD.ITEM_ID             /* TREE에서 찾은 자식 ID로 자식 정보 가져오기 */
 WHERE PARENT.RARITY = 'RARE'                   /* 부모가 RARE인 경우만 */
 ORDER BY CHILD.ITEM_ID DESC                    /* 아이템 ID 내림차순 정렬 */