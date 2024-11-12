import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        System.out.print(maxTriangle(a, b, c));
    }
    public static int maxTriangle(int a, int b, int c) {
    int[] sides = {a, b, c};
    Arrays.sort(sides);
    
    if (sides[0] + sides[1] > sides[2]) return sides[0] + sides[1] + sides[2];
    else {
        sides[2] = sides[0] + sides[1] - 1;
        return sides[0] + sides[1] + sides[2];
    }
}
}