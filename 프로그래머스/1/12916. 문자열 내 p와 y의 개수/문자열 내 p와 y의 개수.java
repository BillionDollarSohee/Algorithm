class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        
        String[] S = s.toUpperCase().split("");
        
        for(int i = 0; i < S.length; i++) {
            if(S[i].equals("P")) {
                countP++;
            } else if(S[i].equals("Y")) {
                countY++;
            }
        }
        
        if(countP==countY || countP==0&&countY==0) {
            answer = true;
        } else { 
            answer = false;
        }

        return answer;
    }
}