import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String st = br.readLine();
            
            if (st.equals(".")) break;
            
            StringBuilder filter = new StringBuilder();
            
            for (char s : st.toCharArray()) {
                if (s == '(' || s == ')' || s == '[' || s == ']') {
                    filter.append(s);
                }
            }
            
            while (filter.indexOf("()") != -1 || filter.indexOf("[]") != -1) {
                filter = new StringBuilder(filter.toString()
                                          .replace("()", "")
                                          .replace("[]", ""));
            }
            
            if (filter.length() == 0) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.print(sb);
    }
}