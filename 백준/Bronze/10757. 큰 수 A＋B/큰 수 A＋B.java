import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        StringTokenizer st = new StringTokenizer(input);



//        BigInteger a = new BigInteger(token);
//        BigInteger b = new BigInteger(token);
//        BigInteger c = a.add(b);
//        System.out.println(c);

//        BigDecimal a = new BigDecimal(token);
//        BigDecimal b = new BigDecimal(token);
//        BigDecimal c = a.add(b);
//        System.out.println(c);

        // 정확도가 떨어짐

        BigDecimal a = new BigDecimal(st.nextToken());
        BigDecimal b = new BigDecimal(st.nextToken());

        BigDecimal sum = a.add(b);
        System.out.println(sum);






    }
}



