class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String numstr = Integer.toString(num);
        String kstr = Integer.toString(k);
        char charK = kstr.charAt(0);
        
        for(int i = 0; i < numstr.length(); i++) {
            char current = numstr.charAt(i);
            if(current == charK) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}