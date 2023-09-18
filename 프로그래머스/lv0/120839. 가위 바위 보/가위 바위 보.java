import java.util.Arrays;
class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");
        for(int i = 0; i < arr.length; i++) {
            String current = arr[i];
            if(current.equals("2")) {
                answer += "0";
            } else if(current.equals("0")) {
                answer += "5";
            } else if(current.equals("5")) {
                answer += "2";
            }
        }
        return answer;
    }
}