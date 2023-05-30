import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int ans = 0;
        for (int i = 0; i < n.length(); i++){
            if ('0' <= n.charAt(i) && n.charAt(i) <= '9'){
                ans = ans*b + ((int)n.charAt(i) - (int)'0');
            }
            else{
                ans = ans*b + ((int)n.charAt(i) - (int)'A' + 10);
            }
        }

        System.out.println(ans);

        //**
        // 숫자 '0'의 아스키 코드 값은 48, 'A'의 아스키 코드 값은 65
        //
        // 예를들어 1AA 16일경우
        // ans = 0 * b + ((int)n.charAt(i) - (int)'A' + 10)는
        // ans = 0 * 16 + (1 - 10 + 10)으로 계산됩니다. 현재값 : 1
        //
        // ans = 1 * b + ((int)n.charAt(i) - (int)'A' + 10)는
        // ans = 1 * 16 + (10 - 10 + 10)으로 계산됩니다. 현재값 : 26
        //
        // ans = 26 * b + ((int)n.charAt(i) - (int)'A' + 10)는
        // ans = 26 * 16 + (10 - 10 + 10)으로 계산됩니다. 결과 : 426
        //
        // **//


    }
}