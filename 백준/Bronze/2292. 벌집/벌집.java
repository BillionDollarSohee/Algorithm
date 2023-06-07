import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());


        int count = 1;
        int six = 1;
        int x = 6;


        for(int i = 1; i<=n; i++){
            if(i==n){
                System.out.println(count);
            }
            if(six==i){
                six=six+x;
                x+=6;
                count++;
            }


        }




    }
}
