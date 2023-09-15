class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            char currentChar = arr[i];
            if(!(currentChar == 'a' ||
                 currentChar == 'e' ||
                 currentChar == 'i' ||
                 currentChar == 'o' ||
                 currentChar == 'u')){
                answer += String.valueOf(currentChar);
            }
        }
        return answer;
    }
}