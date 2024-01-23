class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        String[] arr = Integer.toString(x).split("");
        
        int add = 0;
        for(String e : arr) {
            add += Integer.parseInt(e);
        }
        
        if(x%add==0) {
            answer = true;
        }
        
        return answer;
    }
}