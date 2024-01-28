import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        
        int a = x * (y%10);
        int b = x * (((y-y%10)%100)/10); 
        int c = x * (y/100);
        int total = a + b * 10 + c * 100;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(total);
    }
}