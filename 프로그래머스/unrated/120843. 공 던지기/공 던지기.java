class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        k = ((k-1)*2)%numbers.length;
        answer = numbers[k];
        return answer;
    }
}