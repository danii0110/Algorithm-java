import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if (a == 0 && b == 0) {
                break;
            } else if (b % a == 0) {
                sb.append("factor").append("\n");
            } else if (a % b == 0) {
                sb.append("multiple").append("\n");
            } else {
                sb.append("neither").append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}