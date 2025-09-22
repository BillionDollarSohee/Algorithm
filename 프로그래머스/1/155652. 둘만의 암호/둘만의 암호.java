import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        // skip에 포함된 알파벳 저장
        Set<Character> skipSet = new HashSet<>();
        for (char ch : skip.toCharArray()) {
            skipSet.add(ch);
        }
        
        // s의 각 문자 처리
        for (char c : s.toCharArray()) {
            int count = 0;
            char cur = c;
            
            // index번 이동할 때까지 반복
            while (count < index) {
                cur++;
                if (cur > 'z') cur = 'a';  // z 넘어가면 다시 a로
                
                if (skipSet.contains(cur)) continue; // skip이면 무시
                count++;
            }
            answer.append(cur);
        }
        return answer.toString();
    }
}