import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double max = 0;
        double total = 0;
        int N = Integer.parseInt(br.readLine());

        double[] arr = new double[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) max = arr[i];
        }

        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / max * 100;
            total += arr[i];
        }
        System.out.print(total / N);
    }
}