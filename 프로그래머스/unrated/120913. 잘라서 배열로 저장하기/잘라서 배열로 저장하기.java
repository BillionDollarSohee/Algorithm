class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length();
        String[] answer = new String[(length + n - 1) / n]; 

        for (int i = 0; i < length; i += n) {
            answer[i / n] = my_str.substring(i, Math.min(length, i + n));
        }
        
        return answer;
    }
}