class Solution {
    public int solution(int n, int m, int[] section) {
           int answer = 0;
        int finish = 0;

        for (int i = 0; i < section.length; i++) {
            if (section[i] > finish) {
                // 롤러를 놓을 수 있는 가장 끝은 n - m + 1
                int start = section[i];

                // 만약 롤러 범위가 벽을 넘는다면, 롤러 시작 위치를 조정
                if (start + m - 1 > n) {
                    start = n - m + 1;
                }

                answer++;
                finish = start + m - 1;
            }
        }

        return answer;
    }
}