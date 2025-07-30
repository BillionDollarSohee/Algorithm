
import java.util.Scanner;




public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] input = new int[9][9];

        int max = 0;
        int maxI =0;
        int maxJ =0;

        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                input[i][j]=sc.nextInt();
                if(input[i][j]>max){
                    max = input[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }

        }

        System.out.println(max);
        System.out.println((maxI+1)+" "+(maxJ+1));







    }
}