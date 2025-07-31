import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = "";

        while ((input = br.readLine()) != null && !input.equals("-1")) {
            int num = Integer.parseInt(input);
            List<Integer> divisors = new ArrayList<>();

            if (num < 3 && num != 0) {
                System.out.println(num + " = " + num);
            } else if (isPerfect(num, divisors)) {
                StringBuilder sb = new StringBuilder();
                sb.append(num).append(" = ");
                for (int i = 0; i < divisors.size(); i++) {
                    sb.append(divisors.get(i));
                    if (i != divisors.size() - 1) {
                        sb.append(" + ");
                    }
                }
                System.out.println(sb.toString());
            } else {
                System.out.println(num + " is NOT perfect.");
            }
        }
    }

    // num의 모든 약수를 divisors에 저장하고, 완전수인지 여부 반환
    public static boolean isPerfect(int num, List<Integer> divisors) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                sum += i;
            }
        }
        return sum == num;
    }
}
