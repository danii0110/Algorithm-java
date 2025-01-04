import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] res = new int[m];
        boolean[] visited = new boolean[n + 1];
        
        backtrack(n, m, 0, res, visited, sb);
        
        System.out.print(sb);
    }
    static void backtrack(int n, int m, int depth, int[] res, boolean[] visited, StringBuilder sb) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(res[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                res[depth] = i;
                backtrack(n, m, depth + 1, res, visited, sb);
                visited[i] = false;
            }
        }
    }
}