class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String[] list = control.split("");
        for (int i = 0; i < list.length; i++) {
            switch (list[i]) {
                case "w":
                    n += 1;
                    break;
                case "s":
                    n -= 1;
                    break;
                case "d":
                    n += 10;
                    break;
                case "a":
                    n -= 10;
                    break;
            }
        }
        answer = n;
        return answer;
    }
}