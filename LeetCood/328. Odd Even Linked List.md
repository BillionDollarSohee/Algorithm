https://leetcode.com/problems/odd-even-linked-list/description/

문제 : 연결 리스트를 홀수번째 노드 다음에 짝수번째 노드가 오도록 재구성하여라. <br>
단, 공간복잡도 O(1), 시간 복잡도 O(n)에 풀이하라.<br>

입력 : 1 -> 2 -> 3 -> 4 -> 5 -> 6<br>
출력 : 1 -> 3 -> 5 -> 2 -> 4 -> 6<br>

## 자바 풀이. 반복 구조로 홀짝 노드 처리
공간 복잡도와 시간 복잡도의 제약사항을 지키려면 연결리스트를 리스트도 변환하여 풀 순 없다.<br>
홀/짝 노드를 구성한 후 홀수 노드 마지막을 짝수 노드의 처음과 이어주는 방식으로 풀이할 것이다.

```java
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenhead;
        return head;
    }
}
```

<img width="686" height="442" alt="image" src="https://github.com/user-attachments/assets/32de529f-cd1e-421d-afb6-a20eeb4f729b" />


## 코틀린 풀이

```kotlin
class Solution {
    fun oddEvenList(head: ListNode?): ListNode? {
        if (head == null) return null

        var odd: ListNode = head
        var even = head.next
        val evenhead = even

        while (even?.next != null) {
            odd.next = odd.next.next
            even.next = even.next.next

            odd = odd.next
            even = even.next
        }
        odd.next = evenhead 
        return head
    }
}
```

<img width="679" height="440" alt="image" src="https://github.com/user-attachments/assets/d56fed5b-c10e-40e2-9d45-2c8a3a1098ac" />
