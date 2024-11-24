import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0, res = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
               count++;
               if (count == k) {
                   res = i;
                   break;
               }
            }
        }
        
        if (res == 0) System.out.print(0);
        else System.out.print(res);
    }
}