import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) break;
            else if (b % a == 0) System.out.println("factor");
            else if (a % b == 0) System.out.println("multiple");
            else if (b % a != 0 && a % b != 0) System.out.println("neither");
        }
    }
}