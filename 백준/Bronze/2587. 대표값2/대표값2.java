import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[5];
        int total = 0;
        
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            total += arr[i];
        }
        sb.append((total / 5)).append('\n');
        Arrays.sort(arr);
        sb.append(arr[2]);
        
        System.out.print(sb);
    }
}