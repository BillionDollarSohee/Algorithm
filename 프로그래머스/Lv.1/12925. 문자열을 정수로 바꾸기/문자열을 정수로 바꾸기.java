class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] change = s.split("");
        String current = "";
        
        if(change[0].equals("-")){
            for (int i = 1; i < change.length; i++) {
                current += change[i];
            }
            answer = Integer.parseInt(current);
            answer *= -1;
        } else if(change[0].equals("+")) {
            for (int i = 1; i < change.length; i++) {
                current += change[i];
            }
            answer = Integer.parseInt(current);
        } else {
            for (int i = 0; i < change.length; i++) {
                current += change[i];
            }
            answer = Integer.parseInt(current);
        }
        
        return answer;
    }
}