class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int food = 0;
        int drink = 0;
        
        food = n*12000;
        drink = (k*2000)-((n/10)*2000);
        
        answer = food+drink;
        return answer;
    }
}