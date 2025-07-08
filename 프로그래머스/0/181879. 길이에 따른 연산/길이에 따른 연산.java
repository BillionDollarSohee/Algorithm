class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int listSize = num_list.length;
        if(listSize >= 11){
          for(int e : num_list){
            answer += e;
          }
        } else {
            answer = 1;
          for(int e : num_list){
            answer = answer*e;
          }
        }
        return answer;
    }
}