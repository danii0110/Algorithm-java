import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스의 개수 T 입력받기
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            //반복 횟수 R, 문자열 S 입력받기(공백 구분)
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            StringBuilder sb = new StringBuilder();
            //반복하기
            for(int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                for(int x = 0; x < R; x++) {
                    sb.append(c);
                }
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}