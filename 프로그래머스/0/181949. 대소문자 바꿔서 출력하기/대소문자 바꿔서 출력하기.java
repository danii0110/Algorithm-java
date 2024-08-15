import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String ans = "";
        
        for(int i = 0; i < a.length(); i++) {
            b = a.charAt(i);
            
            if (Character.isUpperCase(b)) {
                 ans += Character.toLowerCase(b);
            } else if (Character.isLowerCase(b)) {
                ans += Character.toUpperCase(b);
            }
        }
        
        System.out.print(ans);
    }
}