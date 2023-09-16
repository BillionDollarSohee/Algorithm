class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(slice > n) {
            answer = 1;
        } else if(n%slice==0){
            answer = n/slice;
        } else if(n%slice!=0){
            answer = (n/slice)+1;
        } 
        return answer;
    }
}