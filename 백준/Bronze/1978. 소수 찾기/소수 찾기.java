import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (isPrime(temp)) count++;
        }
        System.out.print(count);
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}