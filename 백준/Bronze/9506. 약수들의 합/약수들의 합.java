import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            
            if (n == -1) break;
            
            ArrayList<Integer> divisors = new ArrayList<>();
            int sum = 0;
            
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    if (i != n / i) {
                        divisors.add(n / i);
                    }
                }
            }
            
            Collections.sort(divisors);
            divisors.remove(divisors.size() - 1);

            for (int divisor : divisors) {
                sum += divisor;
            }
            
            if (sum == n) {
                sb.append(n).append(" = ");
                for (int i = 0; i < divisors.size(); i++) {
                    sb.append(divisors.get(i));
                    if (i != divisors.size() - 1) {
                        sb.append(" + ");
                    }
                }
                sb.append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.").append("\n");
            }
        }

        System.out.print(sb);
    }
}
