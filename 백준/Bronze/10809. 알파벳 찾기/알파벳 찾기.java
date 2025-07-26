import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = new String[s.length()];

        for(int i=0; i<s.length(); i++){
            ss[i] = String.valueOf(s.charAt(i));
        }

        String[] alp = {"a","b","c","d","e","f","g","h","i","j","k","l",
                "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        int[] result = new int[26];


        for(int i=0; i< result.length; i++){
            for(int j=0; j<s.length(); j++){
                boolean is = false;
                if(alp[i].equals(ss[j])){
                    is=true;
                }
                if(is){
                    result[i]=j;
                    break;
                }
                else {
                    result[i]= -1;
                }
            }


        }

        for(int i =0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }




    }
}