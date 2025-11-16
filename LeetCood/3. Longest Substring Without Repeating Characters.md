[리트코드 3 - 중복 문자 없는 가장 긴 부분 문자열](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)

문제 : 중복 문자가 없는 가장 긴 부분 문자열의 길이를 리턴하라. <br>
입력 : abcabcbbc <br>
출력 : 3 (abc) <br>

## 자바풀이.슬라이딩 윈도우와 투 포인터로 크기조절
슬라이딩 윈도우로 왼쪽에서 오른쪽으로 한칸씩 이동하면서, <br>
모든 문자가 중복이 없도록 투 포인터로 크기를 조절하며 풀면, <br>
세번째부터 길이가 3으로 최대길이가 되며, 6번째까지 변경없이 유지된다. <br>

<img width="443" height="421" alt="image" src="https://github.com/user-attachments/assets/64fe4af5-4954-48af-9146-bfc56c27e859" />

코드에서는 2개의 포인터가 왼쪽에서 출발하며, <br>
used 해시맵에는 문자가 등장한 최종 인덱스를 저장해둔다. <br>
used에서 이미 확인된 문자라면 왼쪽포인터를 기존에 저장되있던 위치 +1로 업데이트하고, <br>
처음 등장하는 문자는 매번 부분 문자열을 확인하면서 더 크다면 maxLength를 업데이트한다. <br>

세번째부터는 최대값인 3을 유지하게 되는데, <br>
오른쪽 포인터는 현재 문자 위치에 맞춰서 값을 점차 증가시킨다. <br>
used에도 현재 문자의 현재위치를 값으로 저장하는데 이렇게하면 used에는 문자의 마지막 위치가 담긴다.<br>

왼쪽 포인터는 현재문자가 기존에 저장된 위치 +1이 되는데, <br>
기존에 이미 등장했다고 무작정 left + 1을 하면 슬라이딩 윈도우 바깥에 있는 문자는 예전에 등장한 적이 있어도 <br>
지금은 더 이상 아무 상관이 없으므로 무시해야 하므로 조건 `left <= used.get(c)`를 추가한다. 
그러면 슬라이딩 윈도우 안쪽에 있는 중복 문자에 대해서만 true 로 처리되어 left 포인터가 업데이트 될 것이다.

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> used = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;

        // 문자열을 문자 단위로 반복
        for (char c : s.toCharArray()) {
            if (used.containsKey(c) && left <= used.get(c)) {
                left = used.get(c) + 1;
            } else {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            used.put(c, right); // 현재 문자 위치 삽입
            right++; // 현재 문자 위치에 맞춰서 계속 증가
        }
        return maxLength;
    }
}
```

<img width="684" height="442" alt="image" src="https://github.com/user-attachments/assets/8c3b7610-830f-4070-8959-8cda087bc2f5" />

## 코틀린 풀이
초반에 이미 등장한 문자인지, 슬라이딩 윈도우의 안쪽에 있는지 판별하는 부분을 <br>
getOrDefault() 를 이용하여 한번의 비교로 처리가 가능하다. <br>
(자바8 이상부터 사용가능하다.) <br>

```kotlin
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val used:MutableMap<Char, Int> = mutableMapOf()
        var maxLength = 0
        var left = 0
        var right = 0

        for (c in s.toCharArray()) {

            // 이미 등장했던 문자이고, 슬라이딩 윈도우의 안쪽에 있다면 left 위치 업데이트
            if (left <= used.getOrDefault(c, -1)) {
                left = used[c]!! + 1
            } else {
                maxLength = max(maxLength, right - left + 1)
            }

            used[c] = right
            right++
        }

        return maxLength
    }
}
```

<img width="689" height="442" alt="image" src="https://github.com/user-attachments/assets/7db73cd3-f384-48df-b822-9514ebfd2a3d" />




