import java.io.Console;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num =0;
		int[] arr3 = new int [30];
		for(int i=0; i<arr3.length; i++) {
			arr3[i] = i+1;
		}
		for(int i=0; i<28; i++) {
			num = sc.nextInt();
			arr3[(num-1)] = 0;	
		}
		for(int i=0; i<arr3.length; i++) {
			if(arr3[i]>0) {
			System.out.println(arr3[i]);
			}
		}

	    



	}


}
