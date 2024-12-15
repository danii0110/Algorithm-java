import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int k = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < k; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp == 0) {
                stack.pop();
            }
            else {
                stack.push(temp);
            }
        }
        int res = 0;
        for (int s : stack) {
            res += s;
        }
        System.out.print(res);
    }
}