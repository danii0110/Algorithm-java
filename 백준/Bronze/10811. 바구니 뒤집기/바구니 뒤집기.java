import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //N(바구니 수), M(역순으로 바꿀 횟수) 입력받기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        //배열 초기화
        for(int i = 0; i < N; i++) {
            arr[i] = (i + 1);
        }

        //M번 반복
        for(int x = 0; x < M; x++) {
            //한 번 역순으로 바꿀 때,
            //1. 순서를 역순으로 만들 범위를 정함
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            //2. 그 범위에 들어있는 바구니의 순서를 역순으로 만듦
            reverse(arr, i , j);
        }
        
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    static void reverse(int[] arr, int x, int y) {
        while (x < y) {
            int temp = arr[x - 1];
            arr[x - 1] = arr[y - 1];
            arr[y - 1] = temp;
            x++;
            y--;
        }
    }
}