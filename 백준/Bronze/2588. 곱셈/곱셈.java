import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        int x = a * (b % 10);
        int y = a * (b / 10 % 10);
        int z = a * (b / 100);
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a * b);
    }
}