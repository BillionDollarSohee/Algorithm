class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String firstNum = "";
        String secondNum = "";
        for(int i = 0; i < my_string.length(); i++) {
            if(i == num1) {
                firstNum = String.valueOf(my_string.charAt(i)); 
            } else if(i == num2) {
                secondNum = String.valueOf(my_string.charAt(i)); 
            }
        } 
        for(int i = 0; i < my_string.length(); i++) {
            if(i == num1) {
                answer += secondNum;
            } else if(i == num2) {
                answer += firstNum;
            } else {
                answer += String.valueOf(my_string.charAt(i)); 
            }
        }
        
        
        return answer;
    }
}