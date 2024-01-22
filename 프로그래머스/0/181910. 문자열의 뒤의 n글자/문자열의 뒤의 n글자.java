class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
            
        for(int i = arr.length-n; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}