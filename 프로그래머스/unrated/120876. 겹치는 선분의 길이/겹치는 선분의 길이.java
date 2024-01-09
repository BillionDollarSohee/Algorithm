import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        List<Double> overlap = new ArrayList<>();

        for (int i = 0; i < lines.length; i++) {
            for (double j = lines[i][0] + 0.5; j < lines[i][1]; j += 1.0) {
                overlap.add(j);
            }
        }

        Map<Double, Integer> countMap = new HashMap<>();

        for (double number : overlap) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        for (int count : countMap.values()) {
            if (count > 1) {
                answer += 1; 
            }
        }

        return answer;
    }
}