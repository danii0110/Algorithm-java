import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        boolean isPalindrome = true;

        for(int i = 0; i < (str.length() / 2); i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome ? "1" : "0");
    }
}