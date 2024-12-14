import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int k = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < k; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp == 0) {
                res -= stack.peek();
                stack.pop();
            }
            else {
                stack.push(temp);
                res += temp;
            }
        }
        System.out.print(res);
    }
}