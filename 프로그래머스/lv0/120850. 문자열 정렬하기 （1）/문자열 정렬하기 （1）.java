import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            char current = my_string.charAt(i);
            if(current >= '0' && current <= '9') {
                int num = Character.getNumericValue(current);
                arr.add(num);
            }
        }
        
        int[] answer = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        Arrays.sort(answer);

        return answer;
    }
}