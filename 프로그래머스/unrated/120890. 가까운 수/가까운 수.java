import java.util.Arrays;
import java.lang.Math;
    
class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int current = Math.abs(n - array[0]);
        
        for(int i = 1; i < array.length; i++){
            int diff = Math.abs(n - array[i]);
            
            if (diff < current || (diff == current && array[i] < answer)) { 
                current = diff;
                answer = array[i];
            }
        }
        
        return answer;
    }
}