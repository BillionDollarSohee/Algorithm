import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 정렬: 내림차순
        Integer[] boxed = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, Collections.reverseOrder());

        int totalBoxes = score.length / m;

        for (int i = 0; i < totalBoxes; i++) {
            // 각 박스마다 m개씩 묶고 마지막 값을 곱함
            int boxMin = boxed[i * m + m - 1]; 
            answer += boxMin * m;
        }

        return answer;
    }
}