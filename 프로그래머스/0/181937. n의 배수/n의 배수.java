class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        
        while(num>=n){
            if(num==n) {
                answer=1;
            }
            num = num-n;
        }
        return answer;
    }
}