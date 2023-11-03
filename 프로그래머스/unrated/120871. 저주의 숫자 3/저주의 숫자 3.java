class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int count = 0;
        while(count<n) {
            if(answer%3==0){
                answer++;
                continue;
            }
            if(Integer.toString(answer).contains("3")) {
                answer++;
                continue;
            }
            answer++;
            count++;
        }
        
    
        return answer-1;
    }
}