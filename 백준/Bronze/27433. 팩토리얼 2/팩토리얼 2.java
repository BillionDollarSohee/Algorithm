import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextInt();

        long result = factorial(num);
        
        System.out.println(result);
    
    }
    
    public static long factorial(long num) {
        if(num == 0) return 1;
        return num * factorial(num-1);
    }
    
}