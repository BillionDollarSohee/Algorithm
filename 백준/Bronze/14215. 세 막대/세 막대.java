import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // arr[0] ≤ arr[1] ≤ arr[2]

        if (arr[2] >= arr[0] + arr[1]) {
            arr[2] = arr[0] + arr[1] - 1; // 삼각형이 되도록 가장 긴 변을 1 줄임
        }

        System.out.println(arr[0] + arr[1] + arr[2]);
    }
}
