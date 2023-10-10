import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        HashMap<String,String> lookup = new HashMap<String,String>();
        lookup.put(".-","a");
        lookup.put("-...","b");
        lookup.put("-.-.","c");
        lookup.put("-..","d");
        lookup.put(".","e");
        lookup.put("..-.","f");
        lookup.put("--.","g");
        lookup.put("....","h");
        lookup.put("..","i");
        lookup.put(".---","j");
        lookup.put("-.-","k");
        lookup.put(".-..","l");
        lookup.put("--","m");
        lookup.put("-.","n");
        lookup.put("---","o");
        lookup.put(".--.","p");
        lookup.put("--.-","q");
        lookup.put(".-.","r");
        lookup.put("...","s");
        lookup.put("-","t");
        lookup.put("..-","u");
        lookup.put("...-","v");
        lookup.put(".--","w");
        lookup.put("-..-","x");
        lookup.put("-.--","y");
        lookup.put("--..","z");
        
        String[] letterArr = letter.split(" ");
        
        for(int i = 0; i < letterArr.length; i++) {
            answer += lookup.get(letterArr[i]);
        }
        
        
        
        return answer;
    }
}