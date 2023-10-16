class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.split("[-+]");
        answer += Integer.parseInt(arr[0].trim());
        int index = 1;
        
        for (int i = 1; i < my_string.length(); i++) {
            String current = Character.toString(my_string.charAt(i));
            if (current.equals("+")) {
                answer += Integer.parseInt(arr[index].trim());
                index++;
            } else if (current.equals("-")) {
                answer -= Integer.parseInt(arr[index].trim());
                index++;
            }
        }
        return answer;
    }
}