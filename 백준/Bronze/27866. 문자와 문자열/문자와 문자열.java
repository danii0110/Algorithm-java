import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //단어 S 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = new String(st.nextToken());
        char[] charArr = str.toCharArray();

        //정수 i 입력받기
        int i = Integer.parseInt(br.readLine());

        //S의 i번째 글자 추출
        System.out.println(charArr[i - 1]);
    }
}