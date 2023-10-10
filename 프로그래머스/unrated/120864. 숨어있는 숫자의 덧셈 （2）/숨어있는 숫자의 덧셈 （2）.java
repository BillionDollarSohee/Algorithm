class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int currentNumber = 0;

        for (char c : my_string.toCharArray()) {
            if (c >= '0' && c <= '9') {
                currentNumber = currentNumber * 10 + (c - '0');
            } else {
                answer += currentNumber;
                currentNumber = 0;
            }
        }

        answer += currentNumber;

        return answer;
    }
}