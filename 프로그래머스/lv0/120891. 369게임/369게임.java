class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = "" + order;
        for (int i = 0; i < strOrder.length(); i++) {
            char current = strOrder.charAt(i);

            if (current == '3' || current == '6' || current == '9') {
                answer++;
            }
        }
        return answer;
    }
}