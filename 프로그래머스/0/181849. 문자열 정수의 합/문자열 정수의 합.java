class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int[] arr = new int[num_str.length()];
        
        for (int i = 0; i < num_str.length(); i++) {
            arr[i] = Character.getNumericValue(num_str.charAt(i));
            answer += arr[i];
        }
        return answer;
    }
}