import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] baguni = new int[n+1];

        int j = 1;
        for(int i=1; i< baguni.length; i++){
            baguni[i]=j;
            j++;
        }


        int a, b= 0;
        for(int i=0; i<m; i++){
            a = sc.nextInt();
            b = sc.nextInt();

            while (a<b){
                int c = baguni[a];
                baguni[a++] = baguni[b];
                baguni[b--] = c;
            }
        }


        String str = "";
        for(int i=1; i<=n; i++){
            str += baguni[i]+" ";
        }

        System.out.println(str);
        sc.close();




    }
}