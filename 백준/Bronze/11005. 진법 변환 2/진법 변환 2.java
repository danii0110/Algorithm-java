import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while (n > 0) {
            int rest = n % b;
            if (rest < 10)
                sb.append(rest);
            else {
                char c = (char) (rest + 55);
                sb.append(c);
            }
            n /= b;
        }
        System.out.print(sb.reverse());
    }
}