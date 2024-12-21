import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }
        while(deque.size() > 1) {
            deque.pollFirst();
            deque.offerLast(deque.pollFirst());
        }
        System.out.print(deque.peekFirst());
    }
}