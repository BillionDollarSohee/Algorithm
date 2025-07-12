import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int result = fibonacci(num);

        System.out.println(result);
    }

    public static int fibonacci(int num) {
        if (num <= 1) return num;
        return fibonacci(num-1) + fibonacci(num-2);
    }
}