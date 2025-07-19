import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, n4, n5, n6 ;
		A = sc.nextInt();	
		n4 = Math.floorMod(A,4) ; //0
		n5 = Math.floorMod(A,400); //0
		n6 = Math.floorMod(A,100); //0이면안됨
		
		
		if (n4 > 0) {
			System.out.println("0");
		}
		else if (n5==0) {
			System.out.println("1");
		}
		else if (n6>0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
		
		
		
		
	}

}