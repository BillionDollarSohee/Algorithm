import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N;
		N = sc.nextInt();
		int[] arr = new int[N];
	    for(int i=0; i<arr.length; i++) {
    	arr[i]= sc.nextInt();
	    }
	    
	    Arrays.stream(arr); //stream 배열명으로 배열생성
	    System.out.print(Arrays.stream(arr).min().getAsInt()+" "); 
	    System.out.print(Arrays.stream(arr).max().getAsInt()+" ");
	   

	}

}
