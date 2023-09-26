import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(direction.equals("left")){
            for(int i = 1; i < numbers.length; i++){
                arr.add(numbers[i]);
            }
            arr.add(numbers[0]);
        }else if(direction.equals("right")) {
            arr.add(numbers[numbers.length-1]);
            for(int i = 0; i < numbers.length-1; i++){
                arr.add(numbers[i]);
            }
        }
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i]=arr.get(i);
        }
        
        return answer;
    }
}