class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] validWords = {"aya", "ye", "woo", "ma"};
       
        for (String word : babbling) {
            String prev = "";
            boolean isValid = true;
           
            int i = 0;
            while (i < word.length()) {
                boolean matched = false;
                for (String valid : validWords) {
                    if (word.startsWith(valid, i)) {
                        if (valid.equals(prev)) {
                            isValid = false;
                            break;
                        }
                        prev = valid;
                        i += valid.length();
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) answer++;
        }
       
        return answer;
    }
}