import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            int[] sides = {a, b, c};
            Arrays.sort(sides); // 정렬하면 sides[2]가 가장 긴 변

            if (sides[2] >= sides[0] + sides[1]) {
                System.out.println("Invalid");
            } else if (sides[0] == sides[2]) { // 세 변이 모두 같을 때
                System.out.println("Equilateral");
            } else if (sides[0] == sides[1] || sides[1] == sides[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
