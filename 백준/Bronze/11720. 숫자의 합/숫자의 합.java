import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String n = br.readLine();
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            sum += n.charAt(i) - '0';
        }
        System.out.print(sum);
    }
}