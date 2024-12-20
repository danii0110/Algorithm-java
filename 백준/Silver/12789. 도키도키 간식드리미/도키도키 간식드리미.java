import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        int flag = 1;
        
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < n; i++) {
            if (flag == arr[i]) {
                flag++;
            } else {
                while (!stack.isEmpty() && stack.peek() == flag) {
                    stack.pop();
                    flag++;
                }
                stack.push(arr[i]);
            }
        }
        
        while (!stack.isEmpty()) {
            if (stack.peek() != flag) {
                System.out.print("Sad");
                return;
            }
            stack.pop();
            flag++;
        }
        
        System.out.print("Nice");
    }
}