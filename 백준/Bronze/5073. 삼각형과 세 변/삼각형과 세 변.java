import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x = 1, y = 1, z = 1;
        
        while (true) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = Integer.parseInt(st.nextToken());
            
            if (x == 0 && y == 0 && z == 0) break;

            if (x + y <= z || y + z <= x || x + z <= y) {
                System.out.println("Invalid");
            } else if (x == y && y == z) {
                System.out.println("Equilateral");
            } else if (x == y || y == z || x == z) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}