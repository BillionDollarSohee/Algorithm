class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length()==4 || s.length()==6) {
            for(int i = 0; i < s.length(); i++) {
                char current = s.charAt(i);
                if(current < '0' || current > '9') {
                    return false;
                }
            }
            answer = true;
        }
        return answer;
    }
}