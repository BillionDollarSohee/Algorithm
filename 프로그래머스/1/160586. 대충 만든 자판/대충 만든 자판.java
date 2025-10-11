import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                
                char current = keymap[i].charAt(j);
                int press = j + 1;

                if (!map.containsKey(current)) {
                    map.put(current, press);
                } else {
                    map.put(current, Math.min(map.get(current), press));
                }
            }
        }

        // 각 문자열을 입력하는 최소 횟수 계산
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            boolean possible = true;

            for (int j = 0; j < targets[i].length(); j++) {
                char current = targets[i].charAt(j);

                if (!map.containsKey(current)) { // 해당 문자 입력 불가
                    possible = false;
                    break;
                }
                count += map.get(current);
            }
            answer[i] = possible ? count : -1;
        }
        
        return answer;
    }
}
