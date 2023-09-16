class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;

        char[] arrStr1 = str1.toCharArray();
        char first = str2.charAt(0);
        
        for (int i = 0; i < arrStr1.length; i++) {
            if (arrStr1[i] == first) {
                boolean is = true;
                for (int j = 1; j < str2.length(); j++) {
                    if (i + j >= arrStr1.length || arrStr1[i + j] != str2.charAt(j)) {
                        is = false;
                        break;
                    }
                }
                if (is) {
                    answer = 1; 
                    break; 
                }
            }
        }
        
        return answer;
    }
}