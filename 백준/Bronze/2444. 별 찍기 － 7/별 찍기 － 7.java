import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 2 * n - 1;

        for(int i = 0; i < cnt; i++) {
            if(i < n) {
                bw.write(" ".repeat(n - i - 1) + "*".repeat(i * 2 + 1) + "\n");
            } else {
                bw.write(" ".repeat((i - n) + 1) + "*".repeat((cnt - i) * 2 - 1) + "\n");
            }
        }
        bw.flush();
    }
}