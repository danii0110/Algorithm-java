import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[9][9];
        int max = 0;
        int maxI = 0, maxJ = 0;

        for(int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((maxI + 1) + " " + (maxJ + 1));
    }
}