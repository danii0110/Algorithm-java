import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        
        if (minutes < 45) {
            hour--;
            if (hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + (minutes + 15));
        } else {
            System.out.println(hour + " " + (minutes - 45));
        }
    }
}