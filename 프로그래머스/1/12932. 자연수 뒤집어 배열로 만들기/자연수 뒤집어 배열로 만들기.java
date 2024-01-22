class Solution {
    public int[] solution(long n) {
        String[] strN = Long.toString(n).split("");
        int[] answer = new int[strN.length];
        for(int i = 0; i < strN.length; i++) {
            answer[answer.length-i-1]= Integer.parseInt(strN[i]);
        }
        return answer;
    }
}