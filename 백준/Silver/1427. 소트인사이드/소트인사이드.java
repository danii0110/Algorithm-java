import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String str = br.readLine();
        Integer[] arr = new Integer[str.length()];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i) - '0';
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int a : arr) {
            sb.append(a);
        }
        System.out.print(sb.toString());
    }
}