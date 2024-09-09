import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder(input);
        String reverseStr = sb.reverse().toString();
        
        System.out.print(input.equals(reverseStr) ? 1 : 0);
    }
}
