class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int bin1ToBinary = Integer.parseInt(bin1, 2);
        int bin2ToBinary = Integer.parseInt(bin2, 2);
        int sum = bin1ToBinary +  bin2ToBinary;
        answer = Integer.toBinaryString(sum);

        return answer;
    }
}