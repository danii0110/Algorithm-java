import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        List<Integer> values = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        
        // 풍선 번호와 값을 초기화
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            deque.add(i); // 풍선 번호 저장
            values.add(Integer.parseInt(st.nextToken())); // 풍선 값 저장
        }
        
        while (!deque.isEmpty()) {
            // 현재 풍선 번호
            int current = deque.pollFirst();
            sb.append(current).append(" ");
            
            if (deque.isEmpty()) break;
            
            // 이동 값(현재 풍선의 값)
            int move = values.get(current - 1);
            
            if (move > 0) {
                // 오른쪽으로 이동
                for (int i = 1; i < move; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                // 왼쪽으로 이동
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }
        
        System.out.print(sb.toString().trim());
    }
}
