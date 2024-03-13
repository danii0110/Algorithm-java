import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        for (int i = 0; i < 100; i++) {
            String temp = br.readLine();
            if (temp == null || temp.isEmpty()) // 입력이 끝나거나 빈 줄인 경우 반복문 종료
                break;
            System.out.println(temp); // 입력을 그대로 출력
        }
    }
}
