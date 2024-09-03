import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int amount = 0;
        
        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            amount += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
        
        String ans = X == amount ? "Yes" : "No";
        System.out.print(ans);
    }
}