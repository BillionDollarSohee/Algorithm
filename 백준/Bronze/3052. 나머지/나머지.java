import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[]arr =new int[10];
		boolean bl;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		for(int i=0; i<arr.length; i++) {
			bl=false;
			for(int k=i+1; k<arr.length; k++) {
				if(arr[i] == arr[k]) {
					bl = true;
					break;
				}
			}
			if(bl==false) {
				count++;
			}
		}
		System.out.println(count);
	}

}
