import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int divide = 2;

        while (n > 1) {
            if (n % divide == 0) {
                System.out.println(divide); // 소인수 출력
                n /= divide;                // 나눈 값으로 갱신
            } else {
                divide++;
            }
        }
        
    }
}