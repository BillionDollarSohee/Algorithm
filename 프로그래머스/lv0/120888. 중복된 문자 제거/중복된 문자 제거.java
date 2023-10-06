import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        Set<Character> uniqueChars = new HashSet<>();

        for (char c : my_string.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                answer+= c;
            }
        }

        return answer.toString();
    }
}