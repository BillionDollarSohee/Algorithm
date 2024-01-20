class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2==0){
            for(int j = 2; j <= n; j=j+2) {
                answer+= j*j;
            }
        } else {
            for(int i = 1; i <= n; i=i+2) {
                answer+= i;
            }
        }
        return answer;
    }
}