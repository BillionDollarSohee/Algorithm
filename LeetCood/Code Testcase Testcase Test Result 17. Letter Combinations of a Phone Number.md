[리트코드 17. - 전화번호 문자 조](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)

<img width="1200" height="973" alt="image" src="https://github.com/user-attachments/assets/72f58753-a6f4-414a-ad35-5c7a33285e0e" />

문제 : 2에서 9까지의 숫자가 주어졌을 때 전화번호로 조합가능한 모든 문자를 출력하라. <br>
입력 : "23" <br>
출력 : ["ad","ae","af","bd","be","bf","cd","ce","cf"] <br>

## 자바풀이. 모든 조합 탐색
이 문제는 가지치기로 최적화할수도 없고, 전체를 탐색해서 풀어야 한다.
2의 a,b,c와 3의 d,e,f의 모든 조합을 탐색한 후에, 백트래킹하면서 결과를 조합했다.

입력값인 digits의 자릿수 단위로 반복하면서, 
현재 자리 숫자에 해당하는 모든 문자를 탐색하면서,
지금까지 구성된 문자열을 path 변수에 저장해 넘기면서 재귀탐색한다.
끌까지 탐색한 이후에는 최종 결과에 result에 저장하고 리턴한다.
최종 결과는 문자열이 저장된 path지만,
결과로 처리된 이후에는 path의 내용이 유지되면 안되므로,
path를 매번 새로운 인스턴스로 전달해서 리턴후에는 사라지게 처리해야한다.

```java
class Solution {
    public void dfs(List<String> result, Map<Character, List<Character>> dic, 
                    String digits, int index, StringBuilder path) {
        // 끝까지 탐색했으면 결과를 저장하고 리턴
        if (path.length() == digits.length()) {
            result.add(String.valueOf(path));
            return;
        }     

        //현재 자리에 숫자에 해당하는 모든 문자열 탐색
        for (Character c : dic.get(digits.charAt(index))) {
            // 현재 자리 +1, 지금까지 구성된 문자열 path를 이용하여 재귀 DFS
            dfs(result, dic, digits, index + 1, new StringBuilder(path).append(c));
        }           
    }

    public List<String> letterCombinations(String digits) {
        // 결과 저장 리스트
        List<String> result = new ArrayList<>();

        // 예외처리
        if (digits.length() == 0) {
            return result;
        }

        Map<Character, List<Character>> dic = new HashMap<>();
        dic.put('0', List.of());
        dic.put('1', List.of());
        dic.put('2', List.of('a', 'b', 'c'));
        dic.put('3', List.of('d', 'e', 'f'));
        dic.put('4', List.of('g', 'h', 'i'));
        dic.put('5', List.of('j', 'k', 'l'));
        dic.put('6', List.of('m', 'n', 'o'));
        dic.put('7', List.of('p', 'q', 'r', 's'));
        dic.put('8', List.of('t', 'u', 'v'));
        dic.put('9', List.of('w', 'x', 'y', 'z'));

        // 현재자리 0에서 빈문자열로 dfs시작
        dfs(result, dic, digits, 0, new StringBuilder());
        return result;       
    }
}
```

<img width="700" height="542" alt="image" src="https://github.com/user-attachments/assets/372c127b-a7ca-4b5c-9738-8d3c480aabbb" />

## 코틀린풀이
자바코드에서 재귀시에 내용이 동일한 변수를 3개나 고정적으로 넘기던 부분을
중첩함수 기능으로 없애 파라미터를 5개에서 2개로 줄일 수 있다.

```kotlin
class Solution {
    fun letterCombinations(digits: String): List<String> {
        val result: MutableList<String> = mutableListOf()

        if (digits.isEmpty()) {
            return result
        }

        val dic: Map<Char, List<Char>> = mapOf(
            '2' to listOf('a', 'b', 'c'),
            '3' to listOf('d', 'e', 'f'),
            '4' to listOf('g', 'h', 'i'),
            '5' to listOf('j', 'k', 'l'),
            '6' to listOf('m', 'n', 'o'),
            '7' to listOf('p', 'q', 'r', 's'),
            '8' to listOf('t', 'u', 'v'),
            '9' to listOf('w', 'x', 'y', 'z')
        )

        fun dfs(index: Int, path: StringBuilder) {
            // 끝까지 찾았으면 결과 저장 후 리턴
            if (path.length == digits.length) {
                result.add(path.toString())
                return
            }

            // 현재자리의 모든 문자열 탐색
            for (c in dic[digits[index]]!!) {
                // 현재자리 +1, 지금까지 구성된 path문자열로 재귀 dfs
                dfs(index + 1, StringBuilder(path).append(c))
            }
        }

        // 현재자리 0, 빈문자열로 dfs시작
        dfs(0, StringBuilder())
        return result
    }
}
```

<img width="701" height="547" alt="image" src="https://github.com/user-attachments/assets/2c67f508-794b-4ac8-84f9-1f9fe3ec488d" />


