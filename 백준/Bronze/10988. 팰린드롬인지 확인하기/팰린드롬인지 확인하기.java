import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += String.valueOf(str.charAt(i));
        }

        if(reverse.equals(str)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
