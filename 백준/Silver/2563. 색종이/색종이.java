import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[100][100];

        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                arr[i][j]= 0;
            }
        }

        int sum = sc.nextInt(); //3
        int a = 0; //3
        int b = 0; //7

        for(int i =0; i<sum; i++) {
            a = sc.nextInt(); //3
            b = sc.nextInt(); //7
            for(int j=a; j<a+10; j++){
                for(int k=b; k<b+10; k++){
                    arr[j][k]=1;
                }
            }
        }

        int area = 0;
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                area += arr[i][j];
//                System.out.print(arr[i][j]);
            }
//            System.out.println("");
        }
        System.out.println(area);



    }
}