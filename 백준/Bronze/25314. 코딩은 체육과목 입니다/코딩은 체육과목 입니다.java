import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int four = 0;
        four = sc.nextInt();
        four = four/4;
        String str = "";
        for(int i = 1; i<=four; i++){
            str += "long ";
        }
        System.out.println(str+"int");



    }
}