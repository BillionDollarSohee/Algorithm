
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        int inputM = sc.nextInt();


        int[][] ball = new int[inputM][3];
        for (int i = 0; i < inputM; i++) {
            for (int j = 0; j < 3; j++) {
                ball[i][j]=sc.nextInt();
            }
        }


        int[] baguni = new int[inputN+1]; //바구니 5칸
        for(int i = 0; i<baguni.length-1; i++){ //0 1 2 3 4
            baguni[i]=0;
        }

        for (int i = 0; i < ball.length; i++) { //4
            int A = ball[i][0];
            int B = ball[i][1];
            int C = ball[i][2];
            for(int k=A; k<=B; k++){
                baguni[k]= C;
            }
        }

        baguni=Arrays.copyOfRange(baguni,1,baguni.length);



        for(int i = 0; i < baguni.length; i++){
            System.out.print(baguni[i]+" ");
        }



    }
}