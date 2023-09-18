class Solution {
    public int[] solution(int n) {
        if(n%2!=0){
            n = n+1;
        }
        int[] answer = new int[n/2];
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(i%2!=0){
                answer[count] = i;
                count++;
            }
        }
        return answer;
    }
}