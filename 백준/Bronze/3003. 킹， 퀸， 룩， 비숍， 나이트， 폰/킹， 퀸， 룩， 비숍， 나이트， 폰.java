import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = {1, 1, 2, 2, 2, 8};

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < arr.length; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] -= temp;
            System.out.print(arr[i] + " ");
        }
    }
}