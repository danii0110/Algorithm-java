import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스의 개수 T 입력받기
        int T = Integer.parseInt(br.readLine());

        //T만큼 반복하여 한 줄에 하나의 문자열 받기
        //각 테케에 대해 주어진 문자열의 첫 글자와 마지막 글자 연속 출력
        for(int i = 0; i < T; i++) {
            String str = br.readLine();
            System.out.print(str.charAt(0));
            System.out.print(str.charAt(str.length() - 1) + "\n");
        }

    }
}