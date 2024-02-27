import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        //N(바구니 개수), M(교환 수) 입력받음
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        //각 바구니에 공 넣기(초기화)
        for(int i = 0; i < N; i++) {
            arr[i] = (i + 1);
        }
        //M번 반복하면서 방법 받고, 공 교환
        for(int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            //교환 방법 받기
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //공을 바꾸는 데 임시저장할 공간
            int temp = arr[a - 1];
            arr[a - 1] = arr[b - 1];
            arr[b - 1] = temp;
        }

        //출력
        for(int i = 0; i < N; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);

    }
}