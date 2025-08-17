import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] count = new int[N + 2];   // 각 스테이지에 머문 사람 수
        int total = stages.length;      // 전체 사람 수

        // 각 스테이지별 도전자 수 세기
        for (int s : stages) {
            count[s]++;
        }

        // 실패율 계산 (스테이지 번호 + 실패율 저장)
        List<double[]> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            double fail;
            if (total == 0) {
                fail = 0; // 더 이상 도전자 없으면 실패율 0
            } else {
                fail = (double) count[i] / total; // 해당 스테이지에 멈춘 사람 ÷ 도전자
            }

            list.add(new double[]{i, fail});
            total -= count[i]; // 다음 스테이지 계산 위해 도전자 수 줄이기
        }
        
        // 실패율 내림차순, 같으면 스테이지 번호 오름차순
        list.sort((a, b) -> {
            if (a[1] == b[1]) return Double.compare(a[0], b[0]); // stage 번호 오름차순
            return Double.compare(b[1], a[1]); // 실패율 내림차순
        });

        // 정렬된 스테이지 번호 answer에 담기
        for (int i = 0; i < N; i++) {
            answer[i] = (int) list.get(i)[0];
        }

        return answer;
    }
}