import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        int result = 0;

        for(int i = 0; i<num; i++){ //happy
            String input = sc.nextLine();
            String [] arr = input.split("");
            boolean isAnswer = true;
            HashSet<String> set = new HashSet<>();
            set.add(arr[0]);

            if (arr.length == 1) {
                result++;
                continue;
            }

            for(int j = 1; j<arr.length;j++){
                if(!arr[j].equals(arr[j-1])){
                    if(set.contains(arr[j])){
                        isAnswer = false;
                        break;
                    }
                    set.add(arr[j]);
                }
            }
            if(isAnswer){
             result++;
            }
        }


        System.out.println(result);



    }
}