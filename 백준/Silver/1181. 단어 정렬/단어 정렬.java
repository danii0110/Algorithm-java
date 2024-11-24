import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        
        ArrayList<String> words = new ArrayList<>(set);
        
        Collections.sort(words, (a, b) -> {
           if (a.length() == b.length()) {
               return a.compareTo(b);
           }
           return Integer.compare(a.length(), b.length());
        });
        
        for (String w : words) {
            sb.append(w).append("\n");
        }
        System.out.println(sb);
    }
}