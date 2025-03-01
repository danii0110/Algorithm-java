import java.io.*;
import java.util.*;

class Main {
    static int n;
    static char[][] grid;
    static boolean[][] visited;
    static final int[] dx = {0, 0, -1, 1};
    static final int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        grid = new char[n][n];

        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine().toCharArray();
        }

        visited = new boolean[n][n];
        int normalArea = countRegions(false);

        visited = new boolean[n][n];
        int colorBlindArea = countRegions(true);

        System.out.println(normalArea + " " + colorBlindArea);
    }

    static int countRegions(boolean isColorBlind) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, grid[i][j], isColorBlind);
                    count++;
                }
            }
        }
        return count;
    }

    static void dfs(int x, int y, char color, boolean isColorBlind) {
        visited[x][y] = true;

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n || visited[nx][ny]) continue;

            char nextColor = grid[nx][ny];

            if (isColorBlind) {
                if ((color == 'R' || color == 'G') && (nextColor == 'R' || nextColor == 'G')) {
                    dfs(nx, ny, color, isColorBlind);
                } else if (nextColor == color) {
                    dfs(nx, ny, color, isColorBlind);
                }
            } else {
                if (nextColor == color) {
                    dfs(nx, ny, color, isColorBlind);
                }
            }
        }
    }
}