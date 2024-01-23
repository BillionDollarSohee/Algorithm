import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        
        int ten = 1;
        for(String i : arr) {
            answer += Long.parseLong(i)*ten;
            ten*=10;
        }
        
        return answer;
    }
}