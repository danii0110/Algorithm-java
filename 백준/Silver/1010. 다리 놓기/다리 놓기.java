import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
    
        int t = Integer.parseInt(br.readLine());
    
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
        
            sb.append(combination(m, n)).append("\n");
        }
        System.out.print(sb);
    }
    static long combination(int m, int n) {
        long res = 1;
        
        for (int i = 0; i < n; i++) {
            res *= (m - i);
            res /= (i + 1);
        }
        return res;
    }
}