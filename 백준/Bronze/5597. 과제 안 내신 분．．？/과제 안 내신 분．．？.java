import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[28];
        int first;
        int second;
        
        for (int i = 0; i < 28; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        
        int count = 0;
        for (int i = 0; i < 28; i++) {
            if (count == 0) {
                if (arr[i] != i + 1) {
                    count++;
                    System.out.println(i + 1);
                }
            } else if (count == 1) {
                if (arr[i] != i + 2) {
                    count++;
                    System.out.println(i + 2);
                }
            }
        }
        
        if (count == 0) System.out.print("29\n30");
        else if (count == 1) System.out.print("30");
    }
}