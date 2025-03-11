import java.io.*;
import java.util.*;
class Node {
    int x, y;
    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Main {
    static int n, m;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        maze = new int[n][m];
        visited = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = str.charAt(j) - '0';
            }
        }
        System.out.print(bfs(0, 0));
    }
    static int bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));
        visited[x][y] = true;
        
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            int curX = node.x;
            int curY = node.y;
            
            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (maze[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.add(new Node(nx, ny));
                        visited[nx][ny] = true;
                        maze[nx][ny] = maze[curX][curY] + 1;
                    }
                }
            }
        }
        return maze[n - 1][m - 1];
    }
}