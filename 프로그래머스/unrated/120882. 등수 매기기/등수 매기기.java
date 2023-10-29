class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sort = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {
            sort[i] =  score[i][0] + score[i][1];
        }
        
        for (int i = 0; i < sort.length; i++) {
            int idx = 1;
            for (int j = 0; j < sort.length; j++) {
                if (sort[i] < sort[j]) {
                    idx++;
                }
            }
            
            answer[i] = idx;
        }
        
        return answer;
    }
}