import java.util.*;
import java.io.*;

class Main {

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEnd = false;
    }

    static class Trie {
        TrieNode root = new TrieNode();

        public void insert(String word) {
            TrieNode node = root;
            for (char ch : word.toCharArray()) {
                node = node.children.computeIfAbsent(ch, c -> new TrieNode());
            }
            node.isEnd = true;
        }

        // 문자열이 트라이에 저장된 문자열 중 접두사인지?
        public boolean isPrefix(String prefix) {
            TrieNode node = root;
            for (char ch : prefix.toCharArray()) {
                if (!node.children.containsKey(ch)) return false;
                node = node.children.get(ch);
            }
            return true;  // 접두사가 있다면 true
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        Trie trie = new Trie();

        for (int i = 0; i < n; i++) {
            trie.insert(br.readLine());
        }

        int answer = 0;

        for (int i = 0; i < m; i++) {
            String target = br.readLine();
            if (trie.isPrefix(target)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}