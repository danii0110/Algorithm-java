import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        
        boolean[] isNotPrime = new boolean[n + 1];
        isNotPrime[0] = isNotPrime[1] = true;
        
        for (int i = 2; i * i <= n; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        
        int sum = 0;
        int min = -1;
        
        for (int i = m; i <= n; i++) {
            if (!isNotPrime[i]) {
                sum += i;
                if (min == -1) {
                    min = i;
                }
            }
        }
        
        if (sum == 0) {
            sb.append(-1);
        } else {
            sb.append(sum).append("\n").append(min);
        }
        System.out.print(sb);
    }
}