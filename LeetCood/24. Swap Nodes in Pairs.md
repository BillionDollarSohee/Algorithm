# 페어의 노드 스왑
https://leetcode.com/problems/swap-nodes-in-pairs/description/

문제 : 연결 리스트를 입력 받아 페어단위로 스왑하라
입력 : 1 -> 2 -> 3 -> 4 -> 5 -> 6
출력 : 2 -> 1 -> 4 -> 3 -> 6 -> 5

## 자바 풀이 1. 값만 교환
직관적으로 연결리스트의 노드를 바꾸지 않고, 값만 바꿔보자. 
대게의 연결리스트는 복잡한 여러가지 값들이 구조체로 구성되어 있어서,
하나의 값만 바꾸는 것은 매우 어려운 일이지만 
이문제에서는 정수형 입력값만 있으므로 이런 변칙적인 풀이가 가능하다. 
하지만 면접관은 이런 풀이를 원하지 않을 수도 있다.

```java
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;

        while (node != null && node.next != null) {
            int tmp;
            tmp = node.val;
            node.val = node.next.val;
            node.next.val = tmp;

            node = node.next.next;
        }    

        return head;
    }
}
```

<img width="679" height="440" alt="image" src="https://github.com/user-attachments/assets/e12db7b7-ef0e-4856-b950-bdd6ede55056" />


## 자바 풀이 2. 반복 구조로 스왑
이번에는 값이 아닌 노드 자체를 바꿔서 해결해보자.
단순 값만 바꿀 때 보다 어렵다.
그 앞 노드(prev) 와 두 노드의 next 포인터 모두 바뀌어야 하기 때문이다.

```java
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(0); // 임시노드
        ListNode root = node;
        node.next = head;

        while (node.next != null && node.next.next != null) {
            ListNode a = node.next;
            ListNode b = node.next.next;

            a.next = b.next;
            node.next = b;
            node.next.next = a;

            node = node.next.next;
        }    

        return root.next;
    }
}
```

<img width="678" height="442" alt="image" src="https://github.com/user-attachments/assets/fd4a9ae8-2c3a-4e94-8206-99baead07ecf" />

## 자바 풀이 3. 재귀
우아한 풀이인 재귀로 구현해보자.
반복풀이와 달리 더미 노드도 필요없고 포인터 역할을 하는 변수 p만 있어도 충분하다.
변수가 적다는 말은 공간복잡도가 낮아진다는 말이다.

하지만 재귀특성상 흐름이 머리로 잘 이해가 되지 않는다.
앞의 두 노드를 스왑하고, 남은 나머지 리스트는 재귀로 처리한다.는 핵심 아이디어를 기억하자

```java
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if (head != null && head.next != null) {
            ListNode p = head.next;
            head.next = swapPairs(head.next.next);
            p.next = head;
            return p;
        }

        return head;
    }
}
```

<img width="683" height="445" alt="image" src="https://github.com/user-attachments/assets/d4172ed8-7453-42f3-b51f-77c0340e35b2" />



## 코틀린 풀이. 재귀
```kotlin
class Solution {
    fun swapPairs(head: ListNode?): ListNode? {
        
        // 현재노드와 다음노드가 있으면 반복
        if (head?.next != null) {
            val p = head.next
            head.next = swapPairs(head.next.next)
            p.next = head
            return p
        }

        return head
    }
}
```

<img width="684" height="439" alt="image" src="https://github.com/user-attachments/assets/2ad96694-62c4-47b8-b61e-ff6e77516a53" />

