import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int s : scoville) { // 우선순위 큐에 모두 삽입
            q.add(s);
        }

        int answer = 0;
        while (!q.isEmpty() && q.peek() < K) {
            if (q.size() < 2) return -1; // 더 이상 섞을 수 없을 때

            int first = q.poll();
            int second = q.poll();
            q.add(first + second * 2);

            answer++;
        }
        return answer;
    }
}
