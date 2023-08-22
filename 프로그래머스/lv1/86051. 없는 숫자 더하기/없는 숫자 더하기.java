import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            set.add(num);
        }

        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            numberSet.add(i);
        }

        // 차집합 구하기
        numberSet.removeAll(set);

        // 남은 요소의 합을 계산하여 answer에 저장
        for (int num : numberSet) {
            answer += num;
        }

        return answer;
    }
}