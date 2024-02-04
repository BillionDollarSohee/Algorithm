class Solution {
    public int solution(int n) {
        String str = "";
        int answer = 0;
        
        while(n != 0) {
            str += n%3;
            n /= 3;
        }
        
        answer = Integer.parseInt(str, 3);
        return answer;
    }
}