class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int length = 0;
        for (boolean e : finished) {
            if (!e) {
                length++;
            }
        }

        String[] answer = new String[length];
        int idx = 0; // answer 배열의 인덱스

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answer[idx] = todo_list[i];
                idx++;
            }
        }

        return answer;
    }
}