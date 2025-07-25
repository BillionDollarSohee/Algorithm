class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int index1 = 0;
        int index2 = 0;
        
        for (String e : goal) {
            if(index1 < cards1.length && e.equals(cards1[index1])) {
                index1++;
            } else if (index2 < cards2.length && e.equals(cards2[index2])) {
                index2++;
            } else {
                answer = "No";
                break;
            }
        }
        
        
            
        return answer;
    }
}