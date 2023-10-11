import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] clone = new int[emergency.length];
        int[] reverse = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            clone[i] = emergency[i];
        }

        Arrays.sort(clone);
        
        for (int i = 0; i < emergency.length; i++) {
            reverse[i] = clone[emergency.length - 1 - i];
        }
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < reverse.length; j++) {
                if(emergency[i]==reverse[j]) {
                    answer[i]=j+1;
                }
            }
        }

        return answer;
    }
}