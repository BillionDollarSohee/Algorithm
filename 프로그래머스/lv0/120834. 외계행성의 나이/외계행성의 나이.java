class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        for (int i = 0; i < str.length(); i++) {
            char digitChar = str.charAt(i);
            int digitValue = Character.getNumericValue(digitChar);
            char mappedChar = (char) (digitValue + 'a');
            answer += mappedChar;
        }
        return answer;
    }
}