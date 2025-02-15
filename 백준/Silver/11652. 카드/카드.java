import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        long mostFrequentNumber = 0;
        int maxCount = 0;
        
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            long key = entry.getKey();
            int value = entry.getValue();
            
            if (value > maxCount || (value == maxCount && key < mostFrequentNumber)) {
                mostFrequentNumber = key;
                maxCount = value;
            }
        }
        
        System.out.println(mostFrequentNumber);
    }
}