import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // 줄바꿈 제거

        for (int i = 0; i < t; i++) {
            String ps = sc.nextLine();
            Deque<Character> stack = new ArrayDeque<>();
            boolean valid = true;

            for (char ch : ps.toCharArray()) {
                if (ch == '(') {
                    stack.addLast(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        valid = false; // 닫는 괄호가 더 많으면
                        break;
                    }
                    stack.removeLast();
                }
            }

            if (!stack.isEmpty()) {
                valid = false; // 열린 괄호가 남으면
            }

            if (valid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}