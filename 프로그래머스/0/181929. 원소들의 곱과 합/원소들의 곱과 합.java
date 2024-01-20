class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int add = 0;
        int casadian = 1;
        for(int i = 0; i < num_list.length; i++){
            add += num_list[i];
            casadian *= num_list[i];
        }
        if(add*add>casadian) {
            answer = 1;
        }
        return answer;
    }
}