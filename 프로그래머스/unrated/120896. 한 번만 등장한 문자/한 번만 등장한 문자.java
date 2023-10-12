import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            String cruuent = arr[i];
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
               if(i==j){
               }else {
                   if(arr[i].equals(arr[j])){
                       count++;
                   }
               }
            }
            if(count==0){
                answer += arr[i];
            }
        }
        
        return answer;
    }
}