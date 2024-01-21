class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        
        for(int i = 0; i < num_list.length; i++) {
            int current = num_list[i];
            if(num_list[i]%2==0) {
                even += Integer.toString(current);
            } else {
                odd += Integer.toString(current);
            } 
        }
        
        answer = Integer.valueOf(even) + Integer.valueOf(odd);
        return answer;
    }
}