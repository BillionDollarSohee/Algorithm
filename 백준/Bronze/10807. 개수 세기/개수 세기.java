import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, V;
		N = sc.nextInt();
		int[] num = new int[N];
		
	    for(int i=0; i<num.length; i++) {
	    	num[i]= sc.nextInt();
	    		    	
	    }
	    V = sc.nextInt();
	    
	    int B =0;
	    
	    for(int i : num) {
	    	if(i == V) {
	    		B++;
	    	}
	    }
	    
	    System.out.println(B);
	    

	    



	}

}
