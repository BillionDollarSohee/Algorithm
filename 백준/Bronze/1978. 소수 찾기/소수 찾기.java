import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
        
}