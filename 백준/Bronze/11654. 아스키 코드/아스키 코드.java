import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //주어짐 + 아스키 코드 출력
        System.out.println((int)br.readLine().charAt(0));
    }
}