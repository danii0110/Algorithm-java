import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        int[] parents = new int[n + 1];
        boolean[] visited = new boolean[n + 1];

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;

        while (!q.isEmpty()) {
            int current = q.poll();;

            for (int child : tree.get(current)) {
                if (!visited[child]) {
                    visited[child] = true;
                    parents[child] = current;
                    q.add(child);
                }
            }
        }
        
        for (int i = 2; i <= n; i++) {
            sb.append(parents[i]).append("\n");
        }
        System.out.print(sb);
    }
}