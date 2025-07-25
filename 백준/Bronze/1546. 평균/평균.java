import java.io.Console;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    int N = sc.nextInt();
		
		double[] arr = new double[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		
		double max =0;
		for (int i =0; i<arr.length; i++) {
		if(arr[i] > max) {
			max = arr[i];
		}
		}

		double[] arr2 = new double[N];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr[i]/max*100;
		}

		
		double average =0, sum=0;
		for(int i=0; i<arr2.length; i++) {
			sum+=arr2[i];  // == sum=sum+arr2[i];
			average=sum/(arr2.length);
		}
		System.out.println(average);




	}


}