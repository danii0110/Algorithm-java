import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int quarter = 25;
        int dime = 10;
        int nickel = 5;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            sb.append(C / quarter).append(" ").append((C % quarter) / dime).append(" ").append(((C % quarter) % dime) / nickel).append(" ").append(((C % quarter) % dime) % nickel);
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}