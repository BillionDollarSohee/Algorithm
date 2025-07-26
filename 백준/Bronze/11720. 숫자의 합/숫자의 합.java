
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); //5
        String m = sc.nextLine(); //54321


        int result = 0;
        int[] num = new int[n];
        for(int i = 0; i< num.length; i++){
            char one = m.charAt(i);
            String two = one+"";
            num[i]=Integer.parseInt(two);
            result += num[i];
        }


        System.out.println(result);





    }
}