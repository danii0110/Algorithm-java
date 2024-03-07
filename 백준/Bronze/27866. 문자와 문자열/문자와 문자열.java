import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char S [] = new char[1000];
        S = br.readLine().toCharArray();

        //정수 i 입력받기
        int i = Integer.parseInt(br.readLine());

        //S의 i번째 글자 추출
        System.out.println(S[i - 1]);
    }
}