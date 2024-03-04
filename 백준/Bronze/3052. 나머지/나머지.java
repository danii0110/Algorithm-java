import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int sum = 0;

        //수 10개 입력받기
        for(int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            arr[i] %= 42;
        }

        //중복 값 제거
        arr = Arrays.stream(arr).distinct().toArray();

        //서로 다른 값이 몇 개 있는지 출력하기
        System.out.println(arr.length);
    }
}