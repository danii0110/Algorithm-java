import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //과목의 개수(N) 입력받기
        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];
        double max = 0;
        double total = 0;

        //성적 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
            //점수 중 최댓값 구하기(M)
            if(arr[i] > max) max = arr[i];
        }

        //모든 점수를 (점수/M*100)으로 고치기
        for(int i = 0; i < N; i++) {
            arr[i] = arr[i] / max * 100;
            total += arr[i];
        }

        //새로운 평균 계산
        System.out.println(total / N);
    }
}