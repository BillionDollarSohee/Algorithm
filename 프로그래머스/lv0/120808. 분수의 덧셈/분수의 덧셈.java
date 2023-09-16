class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int lcm = (denom1 * denom2) / gcd(denom1, denom2); // 최소 공배수 계산
        int sumNumer = numer1 * (lcm / denom1) + numer2 * (lcm / denom2); // 분자 계산
        
        // 최대 공약수를 사용하여 기약 분수로 변환
        int gcdValue = gcd(sumNumer, lcm);
        answer[0] = sumNumer / gcdValue;
        answer[1] = lcm / gcdValue;

        return answer;
    }

    public static int gcd(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
