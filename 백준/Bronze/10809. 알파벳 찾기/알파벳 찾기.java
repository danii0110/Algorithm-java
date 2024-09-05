import java.io.*;
import java.util.Arrays;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (arr[ch - 'a'] == -1) arr[ch - 'a'] = i;
        }
       
        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.print(sb);
    }
}