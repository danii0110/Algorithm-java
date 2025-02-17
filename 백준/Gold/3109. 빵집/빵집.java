import java.io.*;
import java.util.*;

public class Main {
    static int r, s;
    static char[][] board;
    static int count = 0;
    static int[] dr = {-1, 0, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        
        board = new char[r][s];
        for (int i = 0; i < r; i++) {
            board[i] = br.readLine().toCharArray();
        }
        
        for (int i = 0; i < r; i++) {
            if (dfs(i, 0)) {
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean dfs(int row, int col) {
        board[row][col] = 'x';
        
        if (col == s - 1) return true;
        
        for (int i = 0; i < 3; i++) {
            int nr = row + dr[i];
            int nc = col + 1;
            if (isSafe(nr, nc)) {
                if (dfs(nr, nc)) return true;
            }
        }
        return false;
    }
    static boolean isSafe(int row, int col) {
        if (row < 0 || row >= r || col < 0 || col >= s) return false;
        return board[row][col] == '.';
    }
}