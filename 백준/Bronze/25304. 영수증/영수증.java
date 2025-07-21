import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		
		int x= 0;
		int n =0;
		int a =0;
		int b= 0;
		int c =0;
		x = sc.nextInt();
		n = sc.nextInt();
		for (int i = 1; i<=n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = c + a*b;
		}
		
		
		if(x == c) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		

	}

}
