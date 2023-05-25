import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] array = new char[5][15];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String input = scanner.next();
            max = Math.max(max, input.length());

            for (int j = 0; j < input.length(); j++) {
                array[i][j] = input.charAt(j); 
            }
        }

        for (int i = 0; i < max; i++) {
            for(int j =0; j<5; j++){
                if (array[j][i] == '\0')   
                    continue;
                System.out.print(array[j][i]);

            }
        }
        scanner.close();



    }
}