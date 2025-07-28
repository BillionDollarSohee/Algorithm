import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int count = 0;
        for(int i = 0; i < input.length(); i++){
            char one = input.charAt(i);

            if(one == '='){
                if(i > 0){
                    char back = input.charAt(i-1);
                    if(back == 'c' || back == 's' || back == 'z'){
                        count += 1;
                    }
                }
            } else if (one == '-') {
                if(i > 0){
                    char back = input.charAt(i-1);
                    if(back == 'c' || back == 'd'){
                        count += 1;
                    }
                }
            } else if(one == 'j') {
                if(i > 0){
                    char back = input.charAt(i-1);
                    if(back == 'l' || back == 'n'){
                        count += 1;
                    }
                }
            }  else if (one == 'z') {
                if(i+2 < input.length() && input.substring(i, i+3).equals("dz=")){
                    count += 1;
                    i += 2;
                } else if(i+1 < input.length() && input.charAt(i+1)=='='){
                    if(i > 0){
                        char back = input.charAt(i-1);
                        if(back == 'd'){
                            count += 1;
                        }
                    }
                }
            }
        }

        System.out.println(input.length()-count);
    }
}