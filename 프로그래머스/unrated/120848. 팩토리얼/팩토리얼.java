class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int num = 1;
        for(int i = 1; i <= n; i++) {
            num *= i;
            if(num >= 3628800) {
                answer = 10;
                break;
            }
            if(num == n) {
                answer = i;
                break;
            } else if(num > n) {
                answer = i-1;
                break;
            }
        }
       
        return answer;
    }
}