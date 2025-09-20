class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int lowScore = 0;   // 확정 맞춘 개수
        int zeroCount = 0;  // 0 개수
        
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    lowScore++;
                }
            }
        }
        
        int highScore = lowScore + zeroCount;
        
        answer[0] = scoring(highScore); // 최고 순위
        answer[1] = scoring(lowScore);  // 최저 순위
        
        return answer;
    }
    
    public int scoring (int score) {
        switch (score) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6; // 0개~1개 맞춘 경우
        }
    }
}
