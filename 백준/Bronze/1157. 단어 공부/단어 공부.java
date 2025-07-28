import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = br.readLine().toUpperCase();
//        String str = "aaaabbbbcc";

        int[] apb = new int[26];
        int max = -1;
        char st = '?';

        for(int i =0; i<str.length(); i++){
            apb[str.charAt(i)-65]++;
            if(max<apb[str.charAt(i)-65]) {
                max = apb[str.charAt(i)-65];
                st = str.charAt(i);
            } else if (max==apb[str.charAt(i)-65]) {
                st = '?';
            }
        }

        System.out.println(st);







    }
}
