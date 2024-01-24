import java.util.ArrayList;
import java.util.List;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        answer[0]= Long.valueOf(x);
        for (int i = 1; i < n; i ++) {
            answer[i] = answer[i-1]+Long.valueOf(x);
        }
        
        return answer;
    }
}