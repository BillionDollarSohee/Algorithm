import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        int count = 0;
        int arr[] = new int[n];
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count == k) {
                    System.out.println(i);  // K번째 약수를 찾았을 때 바로 출력 후 종료
                    return;             
                }
            }
        }

        // 약수가 K개보다 적을 경우
        System.out.println(0);

    }
}