import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //과목의 개수(N) 입력받기
        int N = Integer.parseInt(br.readLine());

        int max = 0;
        double total = 0;

        //성적 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());

            if(val > max) max = val;
            total += val;
        }

        System.out.println((total / max * 100 / N));
    }
}