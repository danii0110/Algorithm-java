import java.io.*;
import java.util.*;
class Main {
    static int n;
    static int[][] ingredients;
    static int minDiff = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
    
        n = Integer.parseInt(br.readLine());
        ingredients = new int[n][2];
    
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            ingredients[i][0] = s;
            ingredients[i][1] = b;
        }
        findMinDiff(0, 1, 0, 0);
        System.out.print(minDiff);
    }
    
    static void findMinDiff(int idx, int sour, int bitter, int count) {
        if (idx == n) {
            if (count > 0) {
                minDiff = Math.min(minDiff, Math.abs(sour - bitter));
            }
            return;
        }

        findMinDiff(idx + 1, sour * ingredients[idx][0], bitter + ingredients[idx][1], count + 1);

        findMinDiff(idx + 1, sour, bitter, count);
    }
    
}