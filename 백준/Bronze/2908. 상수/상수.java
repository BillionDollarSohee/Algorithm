import java.io.*;
import java.util.*;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        IntUnaryOperator reverse = n -> {
            int r = 0;
            for (; n > 0; n /= 10) r = r * 10 + n % 10;
            return r;
        };

        System.out.println(Math.max(reverse.applyAsInt(a), reverse.applyAsInt(b)));
    }
}
