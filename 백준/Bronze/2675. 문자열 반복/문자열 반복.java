import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); //2
        String result = "";

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] words = str.split(" ");



            int n = Integer.parseInt(words[0]);
            String str1 = words[1];

            String[] add = new String[n];

            for (int j = 0; j < str1.length(); j++) {
                for (int k = 0; k < n; k++) {
                    result += String.valueOf(str1.charAt(j));
                }

            }
            result += "\n";

        }

        System.out.println(result);



    }
}