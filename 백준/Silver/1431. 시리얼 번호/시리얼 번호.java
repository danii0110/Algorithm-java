import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] serials = new String[n];
        
        for (int i = 0; i < n; i++) {
            serials[i] = br.readLine();
        }
        
        Arrays.sort(serials, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            int sumA = sum(a);
            int sumB = sum(b);
            if (sumA != sumB) {
                return sumA - sumB;
            }
            return a.compareTo(b);
        });
        
        for(String s : serials) {
            sb.append(s).append("\n");
        }
        
        System.out.print(sb);
    }
    static int sum(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        return sum;
    }
}