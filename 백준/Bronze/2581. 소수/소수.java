import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine()); // 작은 수
        int n = Integer.parseInt(br.readLine()); // 큰 수

        int sum = 0;
        int min = -1; // 소수가 없을 경우 -1로 초기화

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (min == -1) {
                    min = i;
                }
                sum += i;
            }
        }

        if (min == -1) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) return false;
        }
        return true;
    }
}