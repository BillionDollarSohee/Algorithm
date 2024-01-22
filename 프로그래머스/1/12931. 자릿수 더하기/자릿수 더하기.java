import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] strN = Integer.toString(n).split("");
        for(int i = 0; i < strN.length; i++) {
            answer += Integer.parseInt(strN[i]);
        }

        return answer;
    }
}