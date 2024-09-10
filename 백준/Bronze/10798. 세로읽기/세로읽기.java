import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] words = new String[5];
        
        for (int i = 0; i < 5; i++) {
            words[i] = br.readLine();
        }
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < words[i].length()) {
                    sb.append(words[i].charAt(j));
                }
            }
        }
        System.out.print(sb);
    }
}