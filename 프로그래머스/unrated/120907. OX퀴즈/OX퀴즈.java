class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] current = quiz[i].split(" ");
            int first = Integer.parseInt(current[0]);
            int second = Integer.parseInt(current[2]);
            int result = Integer.parseInt(current[4]);
            
            for(int j = 0; j < current.length; j++) {
                if(current[1].equals("+")){
                    if(first+second==result){
                        answer[i] = "O"; 
                    } else {
                        answer[i] = "X"; 
                    }
                } else if(current[1].equals("-")) {
                    if(first-second==result){
                        answer[i] = "O"; 
                    } else {
                        answer[i] = "X"; 
                    }
                    
                }
            }
        }
            
        return answer;
    }
}