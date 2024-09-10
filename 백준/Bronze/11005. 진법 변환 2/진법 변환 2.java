import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken()); // n의 범위가 크므로 long 사용
        int b = Integer.parseInt(st.nextToken());

        System.out.print(Long.toString(n, b).toUpperCase());
    }
}