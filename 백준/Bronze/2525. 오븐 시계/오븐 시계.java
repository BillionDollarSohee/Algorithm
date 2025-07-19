import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int H, M, T, HH = 0, MM =0;
		H = sc.nextInt();
		M = sc.nextInt();
		T = sc.nextInt();
			

		
		if(M+T>=60) {
			HH = Math.floorMod(Math.floorDiv(M+T,60)+H, 24);
			MM = Math.floorMod(M+T,60);
		}
		else if(M+T<60) {
			MM = M+T;
			HH = H;
		}
					
		System.out.print(HH);
		System.out.print(" ");
		System.out.print(MM);
		
		
		
	}

}
