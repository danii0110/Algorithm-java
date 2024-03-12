import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        x = change(x);
        int y = Integer.parseInt(st.nextToken());
        y = change(y);

        if(x > y) System.out.println(x);
        else System.out.println(y);
    }
    private static int change(int x) {
        int a = x / 100;
        int b = (x % 100) / 10;
        int c = x % 10;
        return c * 100 + b * 10 + a;
    }
}