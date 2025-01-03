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
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] comp = new int[m];
        for (int i = 0; i < m; i++) {
            comp[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < m; i++) {
            if (set.contains(comp[i])) {
                sb.append("1").append("\n");
            } else {
                sb.append("0").append("\n");
            }
        }
        
        System.out.print(sb);
    }
}