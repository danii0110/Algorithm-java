import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int highestPowerOfTwo = Integer.highestOneBit(n);
        int res = (n == highestPowerOfTwo) ? n : (n - highestPowerOfTwo) * 2;
        
        System.out.print(res);
    }
}