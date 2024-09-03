import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        if (M >= 45) {
            M -= 45;
        } else {
            M += 15;
            if (H >= 1) H -= 1;
            else H += 23;
        }
        System.out.printf("%d %d", H, M);
    }
}