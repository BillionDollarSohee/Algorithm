import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		
		int a, b;
		int T = 0;
		T = sc.nextInt();
		for(int i =1; i<=T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case #"+i+": "+(a+b));
		}
	

	}

}
