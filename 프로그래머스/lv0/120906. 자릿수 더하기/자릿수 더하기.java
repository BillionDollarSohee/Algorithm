class Solution {
    public int solution(int n) {
        int answer = 0;
        String StringN = Integer.toString(n);
        String[] arrN = StringN.split("");
        
        for(int i = 0; i < arrN.length; i++) {
            int num = Integer.parseInt(arrN[i]);
            answer += num;
        }
        
        return answer;
    }
}