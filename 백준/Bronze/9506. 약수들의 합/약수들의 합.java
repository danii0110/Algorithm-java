import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = 0;
        
        while (n != -1) {
            n = Integer.parseInt(br.readLine());
            
            if (n == -1) break;
            
            int measure = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    measure += i;
                    arr.add(i);
                }
            }
            
            if (measure == n) {
                sb.append(n).append(" = ");
                for (int i = 0; i < arr.size(); i++) {
                    sb.append(arr.get(i));
                    if (i != arr.size() - 1) {
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