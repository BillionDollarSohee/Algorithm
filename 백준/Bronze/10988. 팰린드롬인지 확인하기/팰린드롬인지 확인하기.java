import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String reverse = "";

        for (int i = input.length()-1; i >= 0; i--) {
            reverse += String.valueOf(input.charAt(i));
        }

        if (input.equals(reverse)) {
           System.out.println(1); 
        } else {
           System.out.println(0);  
        }

    }
}