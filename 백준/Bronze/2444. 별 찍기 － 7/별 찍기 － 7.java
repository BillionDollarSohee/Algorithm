import java.util.Scanner;



public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();



        for(int i = 0; i<input; i++){  //5줄로
            for (int k=input; k>i+1; k--){
                System.out.print(" ");
            }

            for (int j=0; j<i+1; j++) {
                System.out.print("*");

            }

            for (int j=1; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }




        for(int i = 0; i<input-1; i++){  //4줄로

            for (int j=0; j<i+1; j++) {
                System.out.print(" ");

            }

            for (int k=i+1; k<input; k++){
                System.out.print("*");
            }

            for (int k=i+2; k<input; k++){
                System.out.print("*");
            }




            System.out.println("");
        }
    }
}