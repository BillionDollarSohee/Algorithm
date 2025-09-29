import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 명령 개수
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "1": // push
                    int value = Integer.parseInt(st.nextToken());
                    deque.addLast(value);      // 스택처럼 뒤에 넣기
                    break;

                case "2": // pop
                    System.out.println(deque.isEmpty() ? -1 : deque.removeLast());
                    break;

                case "3": // size
                    System.out.println(deque.size());
                    break;

                case "4": // empty
                    System.out.println(deque.isEmpty() ? 1 : 0);
                    break;

                case "5": // top
                    System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
                    break;
            }
        }
    }
}
