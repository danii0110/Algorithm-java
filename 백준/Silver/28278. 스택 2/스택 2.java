import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            
            switch(x) {
                case 1:
                    int y = Integer.parseInt(st.nextToken());
                    stack.push(y);
                    break;
                case 2:
                    sb.append(stack.empty() ? "-1" : stack.pop()).append("\n");
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    sb.append(stack.empty() ? "1" : "0").append("\n");
                    break;
                case 5:
                    sb.append(stack.empty() ? "-1" : stack.peek()).append("\n");
                    break;
            }
        }
        
        System.out.print(sb);
    }
}