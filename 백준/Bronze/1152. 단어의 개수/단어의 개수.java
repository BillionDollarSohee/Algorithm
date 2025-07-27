import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        str = str.strip();

        int st = 0;
        int sp = 0;


        for(int i = 0; i < str.length(); i++) {
            char ck = str.charAt(i);

            if(ck == ' ') {
                sp++;
            }else {
                st++;
            }
        }

        if(st != 0) {
            System.out.println(sp+1);
        }else {
            System.out.println(0);
        }





    }
}