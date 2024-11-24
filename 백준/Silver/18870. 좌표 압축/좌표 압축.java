import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 0;
        
        for (int s : sortedArr) {
            if (!rankMap.containsKey(s)) {
                rankMap.put(s, rank++);
            }
        }
        
        for (int i = 0; i < n; i++) {
            sb.append(rankMap.get(arr[i])).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}