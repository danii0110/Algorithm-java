import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int amount = 0;

        //총 금액 x 입력 받기
        int totalAmount = Integer.parseInt(br.readLine());

        //구매한 물건의 종류 수 n 입력 받기
        int n = Integer.parseInt(br.readLine());

        //for문을 통해 n번 돌며 물건의 가격(a)와 개수(b) 입력받기(공백을 기준으로)
        //계산하기
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            amount += a * b;
        }

        //totalAmount와 계산한 값 비교 후 결과 출력
        if (totalAmount == amount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}