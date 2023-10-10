class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String stringK = Integer.toString(k);
        String all = "";
        for(int l = i; l <= j; l++){
            all += Integer.toString(l);
        }
        
        String[] allArr = all.split("");
        
        for (int l = 0; l < allArr.length; l++) {
            if(allArr[l].equals(stringK)){
                answer++;
            }
        }
            
        return answer;
    }
}