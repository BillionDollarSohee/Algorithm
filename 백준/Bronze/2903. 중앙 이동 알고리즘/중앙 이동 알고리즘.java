import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        double[] p = new double[16];
        p[0]= 4;
        for(int i=1; i<16; i++){
            double m = Math.pow(2, n);
            p[i] = (m+1)*(m+1);
        }



        System.out.println((int)p[n]);





    }
}





