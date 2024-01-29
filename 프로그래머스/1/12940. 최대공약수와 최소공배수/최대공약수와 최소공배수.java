class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = getGCD(n ,m);
        answer[1] = lcm(n, m); 
        
        return answer;
    }
    
    static int getGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return getGCD(num2, num1 % num2);
    }
    
    static int lcm(int a, int b) {
        return (a * b) / getGCD(a, b);
    }
}