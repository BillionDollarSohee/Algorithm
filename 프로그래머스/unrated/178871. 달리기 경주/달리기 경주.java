import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
     Map<String, Integer> playersMap = new HashMap<>();
        
        // 초기 등수 설정
        for (int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
        }
        
        // 플레이어 호출에 따라 등수 조정
        for (String player : callings) {
            int rank = playersMap.get(player);
            String beforePlayer = players[rank-1];
            
            players[rank-1] = player;
            players[rank] = beforePlayer;
            
            playersMap.put(player, rank-1);
            playersMap.put(beforePlayer, rank);
        }

        
        return players;
        
    }
}