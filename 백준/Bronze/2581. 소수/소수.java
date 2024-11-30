import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0, min = -1;
        
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                if (min > i || min == -1) {
                    min = i;
                }
            }
        }
        
        if (sum == 0) {
            sb.append(min);
        } else {
            sb.append(sum).append("\n").append(min);
        }
        System.out.print(sb);
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        for (int i = 2; i *i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}