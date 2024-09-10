import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int c = Integer.parseInt(br.readLine());
            sb.append(c / 25).append(" ").append(c % 25 / 10).append(" ").append(c % 25 % 10 / 5).append(" ").append(c % 5).append("\n");
        }
        System.out.print(sb);
    }
}