import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int res;
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        
        if (x == y && y == z) res = 10000 + x * 1000;
        else if (x == y || y == z || z == x) {
            if (x == y) res = 1000 + x * 100;
            else res = 1000 + z * 100;
        } else {
            if (x > y && x > z) res = x * 100;
            else if (y > x && y > z) res = y * 100;
            else res = z * 100;
        }
        System.out.print(res);
    }
}