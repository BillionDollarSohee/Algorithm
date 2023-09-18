class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                int divisor1 = i;
                int divisor2 = n / i;
                
                if (divisor1 * divisor2 == n) {
                    answer += 1;
                }
            }
        }
        
        return answer;
    }
}