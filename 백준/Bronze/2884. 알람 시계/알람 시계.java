import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H, M =0;
		H = sc.nextInt();
		M = sc.nextInt();
		

			
		if(H>0 && M<45) {
			System.out.print(H-1);
			System.out.print(" ");
			System.out.print(M+60-45);
		}
		else if (H<=0 && M<45) {
			System.out.print(H+23);
			System.out.print(" ");
			System.out.print(M+60-45);
		}
		else if (M>=45) {
			System.out.print(H);
			System.out.print(" ");
			System.out.print(M-45);
		}
	
	
		
		
		
		
		
		
	}

}