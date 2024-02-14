class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i = 1; i < food.length; i++) {
            if(food[i]%2!=0) {
                for(int j = 0; j < (food[i]-1)/2; j ++) {
                    answer += Integer.toString(i);
                }
            } else {
                for(int k = 0; k < food[i]/2; k ++) {
                    answer += Integer.toString(i);
                }
            }
        }
        
        String[] reverse = answer.split("");
        
        answer += "0";
        
        for(int i = reverse.length-1; i >= 0; i--) {
            answer += reverse[i];
        }
        
        
        return answer;
    }
}