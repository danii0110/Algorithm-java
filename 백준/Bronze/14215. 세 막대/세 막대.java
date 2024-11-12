import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int s = 0;
        
        if ( a == b && b == c && c == a ) s = a + b + c;
        else if ( a + b <= c ) {
            c = a + b - 1;
            s = a + b + c;
        }
        else if ( a + c <= b ) {
            b = a + c - 1;
            s = a + b + c;
        }
        else if ( b + c <= a ) {
            a = b + c - 1;
            s = a + b + c;
        }
        else s = a + b + c;

        System.out.print(s);
    }
}