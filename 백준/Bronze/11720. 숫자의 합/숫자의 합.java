import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        int N = Integer.parseInt(br.readLine());

        String num = br.readLine();
        for(int i = 0; i < N; i++) {
            sum += Integer.parseInt(num.substring(i, i+1));
        }
        
        System.out.println(sum);
    }
}