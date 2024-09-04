import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[30];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.toString(i + 1);
        }
        
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(arr));
        for (int i = 0; i < 28; i++) {
            String temp = br.readLine();
            list.remove(temp);
        }
        
        for (String str : list) {
            sb.append(str).append(" ");
        }
        System.out.print(sb);
    }
}