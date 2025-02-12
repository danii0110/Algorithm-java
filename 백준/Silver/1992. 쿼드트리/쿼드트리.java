import java.io.*;
import java.util.*;
class Main {
    static char[][] map;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }
        
        quadTree(0, 0, n);
        
        System.out.print(sb.toString());
    }
    static void quadTree(int x, int y, int size) {
        if(isSame(x, y, size)) {
            sb.append(map[x][y]);
            return;
        }
        
        int newSize = size / 2;
        sb.append("(");
        
        quadTree(x, y, newSize);
        quadTree(x, y + newSize, newSize);
        quadTree(x + newSize, y, newSize);
        quadTree(x + newSize, y + newSize, newSize);
        
        sb.append(")");
    }
    static boolean isSame(int x, int y, int size) {
        char first = map[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (map[i][j] != first) {
                    return false;
                }
            }
        }
        return true;
    }
}