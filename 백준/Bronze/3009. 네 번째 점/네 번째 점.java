import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        
        // x 좌표 세 개 중 하나만 1번 등장 → 그게 네 번째 점의 x 좌표
        // y 좌표 세 개 중 하나만 1번 등장 → 그게 네 번째 점의 y 좌표

        int ansX;
        if (x[0] == x[1]) {
            ansX = x[2];          // 첫 번째와 두 번째가 같으면 세 번째가 다른 값
        } else if (x[0] == x[2]) {
            ansX = x[1];          // 첫 번째와 세 번째가 같으면 두 번째가 다른 값
        } else {
            ansX = x[0];          // 아니면 첫 번째가 다른 값
        }

        int ansY;
        if (y[0] == y[1]) {
            ansY = y[2];
        } else if (y[0] == y[2]) {
            ansY = y[1];
        } else {
            ansY = y[0];
        }

        System.out.println(ansX + " " + ansY);
    }
}
