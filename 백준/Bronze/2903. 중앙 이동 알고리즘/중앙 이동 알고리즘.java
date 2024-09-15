import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print((int)Math.pow((Math.pow(2, n) + 1), 2));
    }
}