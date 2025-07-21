import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t= 0;
		int a =0;
		int b= 0;
		t = sc.nextInt();
		
		
		
		for (int i = 1; i<=t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			int c = 0;
			c = a + b;
			System.out.println(c);
		}
		
		
		

	}

}