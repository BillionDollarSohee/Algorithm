class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int divisorCount = countDivisors(i); // 약수 개수 구하기

            if (divisorCount > limit) {
                answer += power;
            } else {
                answer += divisorCount;
            }
        }

        return answer;
    }

    // 약수의 개수를 세는 함수
    public int countDivisors(int n) {
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++; // i는 약수
                if (i != n / i) {
                    count++; // 짝인 약수 (제곱수면 중복은 세지않음)
                }
            }
        }

        return count;
    }
}