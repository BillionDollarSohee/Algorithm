class Solution {
    public int solution(int[] numbers, int n) {
        int answer = numbers[0];
        
        for(int i = 1; i < numbers.length; i++) {
            int j = numbers[i];
            if(answer>n) {
                break;
            } else {
                answer += numbers[i];
            }
        }
        
        return answer;
    }
}