import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        double v = Integer.parseInt(st.nextToken());

//        int count = 0;
//        int h = 0;
//        for(int i=0; i<=v; i++){
//            h= h+a;
//            count++;
//            if(h>=v){
//                count=i;
//                break;
//            } else {
//                h = h-b;
//            }
//        }
//        System.out.println(count+1);
//        이렇게 푸니까 시간초과가 나왔다.
                
                


        int x = 0;
        x =(int) Math.ceil((v - b) / (a - b));

        System.out.println(  x   );


    }
}

