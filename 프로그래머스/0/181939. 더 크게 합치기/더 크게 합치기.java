class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        String AB = A+B;
        String BA = B+A;
        int resultA = Integer.valueOf(AB);
        int resultB = Integer.valueOf(BA);
        
        if(a==b || resultA>resultB){
            answer = resultA;
        } else {
            answer = resultB;
        }
        
        return answer;
    }
}