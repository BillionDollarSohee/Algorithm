import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        Arrays.sort(dots, new Comparator<int[]>() {

            public int compare(int[] o1, int[] o2) {
                 if(o1[0] == o2[0]) {
                         return o1[1] - o2[1];
                 }else {
                     return o1[0] - o2[0]; 
                 }
           }
        });
        
        int w = Math.abs(dots[0][0] - dots[3][0]); // 가로 길이
        int h = Math.abs(dots[0][1] - dots[3][1]); // 세로 길이
        answer = h * w;
       
        return answer;
    }
}