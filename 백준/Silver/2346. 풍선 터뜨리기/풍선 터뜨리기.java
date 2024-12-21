import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        Deque<int[]> deque = new ArrayDeque<>();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int value = Integer.parseInt(st.nextToken());
            deque.add(new int[]{i, value});
        }
        
        while (!deque.isEmpty()) {
            int[] current = deque.pollFirst();
            sb.append(current[0]).append(" ");
            
            if (deque.isEmpty()) break;
            
            int move = current[1];
            
            if (move > 0) {
                for (int i = 1; i < move; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }
        
        System.out.print(sb.toString().trim());
    }
}
