class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        if(arr.length == 0 || arr.length == 1) return answer;
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        int[] result = new int[arr.length - 1];
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            
            result[count] = arr[i];
            count++;
        }
        

        return result;
    }
}