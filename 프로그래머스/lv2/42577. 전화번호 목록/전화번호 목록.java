import java.util.HashMap;
class Solution {
    public boolean solution(String[] phone_book) {
       HashMap<String, Boolean> table = new HashMap<>();
        
        for (String number : phone_book) {
            table.put(number, true);
        }
        
        for (String number : phone_book) {
            String str = "";
            for (int i = 0; i < number.length() - 1; i++) {
                str += number.charAt(i);
                if (table.containsKey(str)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}