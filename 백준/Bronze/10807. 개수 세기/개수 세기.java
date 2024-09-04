import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = 0;
        int N = Integer.parseInt(br.readLine());
        
        String[] arr = new String[N];
        st = new StringTokenizer(br.readLine());
        String v = br.readLine();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken();
            if (arr[i].equals(v)) count++;
        }
        System.out.print(count);
    }
}