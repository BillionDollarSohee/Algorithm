import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> a = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            if(!a.contains(nums[i])) a.add(nums[i]);
        }
        
        if (a.size() > nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = a.size();
        }
        
        return answer;
    }
}