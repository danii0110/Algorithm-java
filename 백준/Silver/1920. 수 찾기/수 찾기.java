import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        while(st.hasMoreTokens()) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (set.contains(num)) sb.append("1\n");
            else sb.append("0\n");
        }
        
        System.out.print(sb);
    }
}