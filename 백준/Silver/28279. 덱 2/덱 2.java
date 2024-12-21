import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String c = st.nextToken();
            
            int temp;
            
            switch (c) {
                case "1":
                    temp = Integer.parseInt(st.nextToken());
                    deque.addFirst(temp);
                    break;
                case "2":
                    temp = Integer.parseInt(st.nextToken());
                    deque.addLast(temp);
                    break;
                case "3":
                    sb.append(!deque.isEmpty() ? deque.pollFirst() : -1).append("\n");
                    break;
                case "4":
                    sb.append(!deque.isEmpty() ? deque.pollLast() : -1).append("\n");
                    break;
                case "5":
                    sb.append(deque.size()).append("\n");
                    break;
                case "6":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "7":
                    sb.append(!deque.isEmpty() ? deque.peekFirst() : -1).append("\n");
                    break;
                case "8":
                    sb.append(!deque.isEmpty() ? deque.peekLast() : -1).append("\n");
                    break;
            }
        }
        
        System.out.print(sb);
    }
}