import java.lang.StringBuilder;
class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                // 소문자를 대문자로 변환
                answer.append((char) (currentChar - 32));
            } else if (currentChar >= 'A' && currentChar <= 'Z') {
                // 대문자를 소문자로 변환
                answer.append((char) (currentChar + 32));
            } else {
                // 다른 문자는 그대로 추가
                answer.append(currentChar);
            }
        }
        return answer.toString();
    }
}