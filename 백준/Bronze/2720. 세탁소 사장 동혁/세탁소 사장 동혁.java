import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(br.readLine());
        }

        int[] coin = new int[]{25, 10, 5, 1};
        int[][] result = new int[n][4];

        int max = 0;
        for (int i = 0; i < n; i++) { //거스름 횟수 만큼 반복
            for (int j = 0; j < coin.length; j++) { //코인개수 만큼 반복
                while (c[i] >= coin[j]) {
                    c[i] = c[i] - coin[j];
                    max++;
                }
                if (c[i] < coin[j]) {
                    result[i][j]=max;
                    max = 0;
                }
            }
            System.out.println(result[i][0]+" "+result[i][1]+" "+result[i][2]+" "+result[i][3]);
        }

    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int C, T = sc.nextInt();
//
//        for (int i = 0; i < T; i++) {
//            C = sc.nextInt();
//            System.out.println(C/25 + " " + (C%25)/10 + " " + ((C%25)%10)/5 + " " + C%5);
//        }
//    }
//}
