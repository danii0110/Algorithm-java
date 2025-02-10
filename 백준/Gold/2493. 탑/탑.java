import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<int[]> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(st.nextToken());
            
            while(!stack.isEmpty() && stack.peek()[0] < height) {
                stack.pop();
            }
            if (stack.isEmpty()) sb.append("0 ");
            else sb.append(stack.peek()[1] + 1).append(" ");
            
            stack.push(new int[]{height, i});
        }
        System.out.print(sb);
    }
}