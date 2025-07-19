import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int A, B, C, D, E ;
		A = sc.nextInt();
		B = sc.nextInt();
		
		C = B%100%10; //1의자리수
		D = B%100/10; //10의자리수
		E = B/100;    //100의자리수
		
		
		System.out.println(A*C);
		System.out.println(A*D);
		System.out.println(A*E);
		System.out.println(A*B);
		
		
		
	}

}
