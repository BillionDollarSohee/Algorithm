class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int d = timelogs[0].length;     

        for (int i = 0; i < schedules.length; i++) {
            boolean isPunctual = true;
            int scheduleMinutes = timeToMinutes(schedules[i]);
            int allowedTime = scheduleMinutes + 10;

            for (int j = 0; j < d; j++) {
                int dayOfWeek = (startday + j - 1) % 7 + 1; // 요일 계산 (1: 월요일, ..., 7: 일요일)

                if (dayOfWeek <= 5) {
                    int logMinutes = timeToMinutes(timelogs[i][j]);
                    if (logMinutes > allowedTime) {
                        isPunctual = false;
                        break;
                    }
                }
            }

            if (isPunctual) {
                answer++;
            }
            
        }
        return answer;
    }

    public int timeToMinutes(int time) {
        int hour = time / 100;
        int minute = time % 100;
        return hour * 60 + minute;
    }
}