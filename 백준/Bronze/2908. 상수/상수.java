import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numbers = sc.nextLine();

        String[] num = numbers.split("");

        String reverseNum = "";

        for(int i=num.length-1; i>=0; i--){
            reverseNum += num[i];
        }



        String[] num2 = reverseNum.split(" ");
        int A = Integer.parseInt(num2[0]);
        int B = Integer.parseInt(num2[1]);

        if(A>B){
            System.out.println(A);
        }else {
            System.out.println(B);
        }
    }
}