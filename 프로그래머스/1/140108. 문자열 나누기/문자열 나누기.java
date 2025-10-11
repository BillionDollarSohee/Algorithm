class Solution {
    public int solution(String s) {
         return split(s);
    }

    private int split(String s) {
        if (s.length() == 0) {
            return 0;
        }

        char x = s.charAt(0);
        int sameCount = 0;
        int otherCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                sameCount++;
            } else {
                otherCount++;
            }

            if (sameCount == otherCount) {
                return 1 + split(s.substring(i + 1));
            }
        }

        return 1;
    }
}
