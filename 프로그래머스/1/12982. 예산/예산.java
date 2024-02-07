import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int answer = 0;
        int remainingBudget = budget;

        for (int cost : d) {
            if (remainingBudget >= cost) {
                remainingBudget -= cost;
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}