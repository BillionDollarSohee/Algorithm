class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        // X 숫자 개수 세기
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }

        // Y 숫자 개수 세기
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();

        // 9부터 0까지 공통으로 등장하는 최소 개수만큼 사용
        for (int i = 9; i >= 0; i--) {
            int common = Math.min(countX[i], countY[i]);
            while (common-- > 0) {
                sb.append(i);
            }
        }

        // 공통 숫자 없음
        if (sb.length() == 0) return "-1";

        // 전부 0으로만 구성
        if (sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}