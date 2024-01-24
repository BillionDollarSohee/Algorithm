import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor==0) {
                list.add(arr[i]);
            }
        }
        
        if(list.size() > 0) {
            int[] result = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            Arrays.sort(result);
            return result;
             
        } else {
            return answer;
        }
        
    }
}