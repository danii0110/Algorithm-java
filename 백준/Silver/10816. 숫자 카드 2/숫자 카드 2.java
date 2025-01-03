import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(num, 0)).append(" ");
        }
        
        System.out.print(sb);
    }
}