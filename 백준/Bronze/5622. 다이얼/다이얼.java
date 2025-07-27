import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] s = str.split("");
        int[] num = new int[s.length];

        for(int i=0; i<s.length; i++){
            if(s[i].equals("A")||s[i].equals("B")||s[i].equals("C")){
                num[i]=2;
            } else if(s[i].equals("D")||s[i].equals("E")||s[i].equals("F")){
                num[i]=3;
            } else if(s[i].equals("G")||s[i].equals("H")||s[i].equals("I")){
                num[i]=4;
            } else if(s[i].equals("J")||s[i].equals("K")||s[i].equals("L")){
                num[i]=5;
            } else if(s[i].equals("M")||s[i].equals("N")||s[i].equals("O")){
                num[i]=6;
            } else if(s[i].equals("P")||s[i].equals("Q")||s[i].equals("R")||s[i].equals("S")){
                num[i]=7;
            } else if(s[i].equals("T")||s[i].equals("U")||s[i].equals("V")){
                num[i]=8;
            } else if(s[i].equals("W")||s[i].equals("X")||s[i].equals("Y")||s[i].equals("Z")){
                num[i]=9;
            }
        }

        int count =0;
        for(int i=0; i<num.length; i++){
            count+= num[i]+1;
        }

        System.out.println(count);
    }
}