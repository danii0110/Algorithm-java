import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            
            while (str.contains("()")) {
                str = str.replace("()", "");
            }
            sb.append(str.isEmpty() ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}