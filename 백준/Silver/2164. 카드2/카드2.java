import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }
        
        while(queue.size() > 1) {
            queue.remove();
            queue.offer(queue.poll());
        }
        System.out.print(queue.peek());
    }
}