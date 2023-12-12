import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int i = 0; i < array.length; i++) {
            int currentNum = array[i];
            int currentCount = countMap.getOrDefault(currentNum, 0);
            countMap.put(currentNum, currentCount + 1);
            answer = Math.max(answer, currentCount + 1);
        }
        
        int modeCount = 0;
        int modeValue = 0;
        for (int key : countMap.keySet()) {
            int currentCount = countMap.get(key);
            if (currentCount == answer) {
                modeCount++;
                modeValue = key;
            }
            if (modeCount > 1) {
                return -1;
            }
        }
        
        return modeValue;
    }
}