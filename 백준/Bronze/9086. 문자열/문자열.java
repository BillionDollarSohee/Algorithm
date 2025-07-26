import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] test = new String[n];

        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            test[i] = s;
        }



        for(int i = 0; i < n; i++) {
            String result = "";
            if (isNumeric(test[i]) == false) {
                result += test[i].charAt(0);
                result += test[i].charAt(test[i].length() - 1);
                System.out.println(result);
            }
        }





    }

    public static boolean isNumeric(String s) {  //숫자 true
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}