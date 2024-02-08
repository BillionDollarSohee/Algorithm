class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = "";
        String current = "";
        String[] arr = s.split("");
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < arr.length; i++) {
            if(isInteger(arr[i])) {
                str += arr[i];
            } else {
                current += arr[i];
                for(int j = 0; j < num.length; j++) {
                    if(current.equals(num[j])) {
                        str += Integer.toString(j);
                        current = "";
                        break;
                    }
                }
            }
        }

        answer = Integer.parseInt(str);
        return answer;
    }


    public static Boolean isInteger(String strValue) {
        try {
          Integer.parseInt(strValue);
          return true;
        } catch (NumberFormatException ex) {
          return false;
        }
    }
    
}