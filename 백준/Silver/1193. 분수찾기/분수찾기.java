import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());


        int cnt = 0;
        int n = 0;

        while (true) {
            n++;
            cnt +=n;
            if(cnt>=input) {
                if(n%2==0) {
                    System.out.println(input-cnt+n+"/"+(cnt-input+1));
                }else {
                    System.out.println((cnt-input+1)+"/"+(input-cnt+n));
                }
                break;
            }
        }



    }
}

