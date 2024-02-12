//n 입력받기
//1~n까지의 합 구하기
//출력
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println(sum);
    }
}