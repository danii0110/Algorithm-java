import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<int[]> lines = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            lines.add(new int[]{x, y});
        }
        
        Collections.sort(lines, Comparator.comparingInt(a -> a[0]));
        
        int totalLength = 0;
        int start = lines.get(0)[0];
        int end = lines.get(0)[1];
        
        for (int i = 1; i < n; i++) {
            int[] line = lines.get(i);
            
            if (line[0] <= end) {
                end = Math.max(end, line[1]);
            } else {
                totalLength += (end - start);
                start = line[0];
                end = line[1];
            }
        }
        totalLength += (end - start);
        System.out.print(totalLength);
    }
}