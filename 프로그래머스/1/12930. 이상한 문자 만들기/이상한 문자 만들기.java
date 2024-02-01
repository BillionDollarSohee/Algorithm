class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int odd = 1;
        
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(" ")) {
                answer += " ";
                odd = 1;
            } else if(odd%2==0) {
                answer += arr[i].toLowerCase();
                odd++;
            } else if(odd%2!=0){   
                answer += arr[i].toUpperCase();
                odd++;
            }
        }
  

        return answer;
    }
}