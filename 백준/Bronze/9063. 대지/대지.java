import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            if (x < minX) minX = x;
            if (x > maxX) maxX = x;
            
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }
        System.out.print((maxX - minX) * (maxY - minY));
    }
}