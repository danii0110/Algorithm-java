import java.io.*;
import java.util.HashSet;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                ans++;
            }
        }

        System.out.print(ans);
    }

    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];
        char prev = ' ';

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            
            if (current != prev && visited[current - 'a']) {
                return false;
            }
            visited[current - 'a'] = true;
            prev = current;
        }
        return true;
    }
}