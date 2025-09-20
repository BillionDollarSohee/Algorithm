class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int turn = -1; 
        
        for (int i = 0; i < dartResult.length();) {
            char currentChar = dartResult.charAt(i);

            if (Character.isDigit(currentChar)) {
                turn++;
                int start = i;
                
                // 점수가 10이상의 경우
                while (i + 1 < dartResult.length() && Character.isDigit(dartResult.charAt(i + 1))) {
                    i++;
                }
                
                String numberStr = dartResult.substring(start, i + 1);
                score[turn] = Integer.parseInt(numberStr);
                
                i++;
            } else {
                switch (currentChar) {
                    case 'S':
                        score[turn] = (int) Math.pow(score[turn], 1);
                        break;
                    case 'D':
                        score[turn] = (int) Math.pow(score[turn], 2);
                        break;
                    case 'T':
                        score[turn] = (int) Math.pow(score[turn], 3);
                        break;
                    case '*':
                        score[turn] *= 2;
                        if (turn > 0) {
                            score[turn - 1] *= 2;
                        }
                        break;
                    case '#':
                        score[turn] *= -1;
                        break;
                }
                
                i++; // 다음 점수로 이동
            }
        }
        
        int totalScore = 0;
        for (int i = 0; i < 3; i++) {
            totalScore += score[i];
        }
        
        return totalScore;
    }
}