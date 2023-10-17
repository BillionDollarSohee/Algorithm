class Solution {
    public long solution(String numbers) {
        long answer = 0;

        String[] numberArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        String current = "";
        for (int i = 0; i < numbers.length(); i++) {
            current += numbers.charAt(i);

            for (int j = 0; j < numberArr.length; j++) {
                if (current.equals(numberArr[j])) {
                    answer = answer * 10 + j;
                    current = "";
                }
            }
        }

        return answer;
    }
}