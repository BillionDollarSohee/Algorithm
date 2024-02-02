class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        String[] arr = t.split("");
        
  
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String current = t.substring(i, i + p.length());
            if (current.compareTo(p) <= 0) {
                answer++;
            }
        }
        return answer;
    }
}