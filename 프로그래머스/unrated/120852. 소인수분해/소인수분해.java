import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        HashSet<Integer> arr = new HashSet<>();
        
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                arr.add(i);
                n = n / i;
            } else {
                i++;
            }
        }
        
        int[] answer = new int[arr.size()];
        int index = 0;
        for (int factor : arr) {
            answer[index++] = factor;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}