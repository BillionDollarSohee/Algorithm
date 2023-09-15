class Solution {
    public int solution(int[] numbers) {
        int firstMax = 0;
        int secondMax = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (firstMax < numbers[i]) {
                secondMax = firstMax;
                firstMax = numbers[i];
            } else if (secondMax < numbers[i]) {
                secondMax = numbers[i];
            }
        }
        
        return firstMax * secondMax;
    }
}