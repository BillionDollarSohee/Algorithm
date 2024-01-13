class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int e : arr){
            answer += e;
        }
        
        answer=answer/arr.length;
        return answer;
    }
}