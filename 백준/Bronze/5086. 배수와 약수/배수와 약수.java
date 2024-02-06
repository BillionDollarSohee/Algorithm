import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            // 입력 종료 조건
            if (num1 == 0 && num2 == 0) {
                break;
            }

            // num1이 num2의 약수인지 여부 확인
            if (num2 % num1 == 0) {
                System.out.println("factor");
            }
            // num1이 num2의 배수인지 여부 확인
            else if (num1 % num2 == 0) {
                System.out.println("multiple");
            }
            // 둘 다 아닌 경우
            else {
                System.out.println("neither");
            }
        }
    }
}