import java.lang.Math;
class Solution {
    public int solution(int n) {
        int answer = 0;
        double num = Math.sqrt(n);
        if(num%1==0){
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}