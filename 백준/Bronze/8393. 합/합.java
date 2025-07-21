import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	

		int n =0;
		int m =0;
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			m = m+i;
		}
		System.out.println(m);

	}

}