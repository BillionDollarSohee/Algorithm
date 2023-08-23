import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> resultList = new ArrayList<>(); // 결과를 저장할 리스트

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                resultList.add(arr[i]);
            }
        }

        int[] answer = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
        
    }
}