import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}