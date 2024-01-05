class Solution {
    public int[] solution(int num, int total) {
        int[] result = new int[num];

        int start = total / num - ((num - 1) / 2);
        int sum = 0;

        for (int i = 0; i < num; i++) {
            result[i] = start + i;
            sum += result[i];
        }


        return result;
    }
}