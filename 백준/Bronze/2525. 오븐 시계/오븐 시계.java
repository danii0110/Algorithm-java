import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.nextLine();
        int C = sc.nextInt();
        sc.close();
        
        B += C;
        if (B >= 60) {
            int temp = B / 60;
            B = B % 60;
            A += temp;
        }
        if (A > 23) {
            A -= 24;
        }
        System.out.println(A + " " + B);
    }
}