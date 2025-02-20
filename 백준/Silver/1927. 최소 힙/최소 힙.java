import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine()); // 연산의 개수 n
        
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            
            if (x > 0) {
                // 배열에 x라는 값을 추가
                pq.offer(x);
            } else if (x == 0) {
                // 배열에서 가장 작은 값을 출력 && 그 값을 배열에서 제거
                Integer min = pq.poll();
                sb.append(min == null ? 0 : min).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}