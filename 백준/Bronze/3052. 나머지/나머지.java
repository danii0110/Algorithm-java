import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }
        
        arr = Arrays.stream(arr).distinct().toArray();
        System.out.print(arr.length);
    }
}