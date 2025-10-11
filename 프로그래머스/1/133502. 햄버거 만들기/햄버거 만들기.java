class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int ing : ingredient) {
            sb.append(ing);

            if (sb.length() >= 4) {
                // 뒤에서 4글자 뽑기
                if (sb.substring(sb.length() - 4).equals("1231")) {
                    answer++;
                    // 햄버거 만든 부분 제거(뒤에서 4글자 삭제)
                    sb.delete(sb.length() - 4, sb.length());
                }
            }
        }
        return answer;
    }
}