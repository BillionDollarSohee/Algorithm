import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(System.out));
		
		String str = br.readLine();	
	
		int  a, b;
		int T = Integer.parseInt(str); 
		for(int i=1; i<=T; i++) {
			String number = br.readLine();
			StringTokenizer st = new StringTokenizer(number);
			a = Integer.parseInt(st.nextToken()); 
			b = Integer.parseInt(st.nextToken()); 
			bw.write((a+b)+"\n"); 
		}
			
		bw.flush();
		bw.close();
		
	}

}