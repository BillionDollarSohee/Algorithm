class Solution {
    public int solution(int a, int b) {
        String add = (a+"")+(b+"");
        int strAdd = Integer.parseInt(add);
        int multiply = 2 * a * b;
        
        if (strAdd > multiply) {
            return strAdd;
        } else {
            return multiply;
        }
    }
}