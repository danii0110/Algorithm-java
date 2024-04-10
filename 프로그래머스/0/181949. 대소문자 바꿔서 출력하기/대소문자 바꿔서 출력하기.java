import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String output = "";
        int temp;
        
        for(int i = 0; i < str.length(); i++) {
            temp = (int)str.charAt(i);
            if((65 <= temp) && (temp <= 90)) {
                output += (char)(temp + 32);
            } else if((97 <= temp) && (temp <= 122)) {
                output += (char)(temp - 32);
            } else {
                output += (char)temp;
            }
        }
        System.out.println(output);
    }
}