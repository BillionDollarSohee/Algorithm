class Solution {
    public long solution(long n) {
        long answer = -1;
        double a = Math.sqrt(n);
        
        if(a % 1 == 0.0) {
            answer = ((new Double(a)).longValue()+1)*((new Double(a)).longValue()+1);
        }
        
        return answer;
    }
}