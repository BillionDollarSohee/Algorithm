class Solution {
    public int solution(String s) {
        String str = "";
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        String strNum = "";
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (Character.isDigit(current)) {
                str += current;
            } else {
                strNum += current;
                for (int j = 0; j < 10; j++) {
                    if (num[j].equals(strNum)) {
                        str += j;
                        strNum = ""; 
                        break;
                    }
                }
            }
        }
        return Integer.parseInt(str);
    }
}