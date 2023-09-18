class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arrStr = my_string.split("");
        for(String e : arrStr){
            if(e.equals("0")||e.equals("1")||e.equals("2")||e.equals("3")||e.equals("4")
            ||e.equals("5")||e.equals("6")||e.equals("7")||e.equals("8")||e.equals("9")){
                answer += Integer.parseInt(e);
            }
        }
        return answer;
    }
}