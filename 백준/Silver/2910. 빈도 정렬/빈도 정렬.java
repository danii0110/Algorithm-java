import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> order = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            numbers.add(num);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            if (!order.contains(num)) {
                order.add(num);
            }
        }

        numbers.sort((a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);

            if (freqA == freqB) {
                return order.indexOf(a) - order.indexOf(b);
            }
            return freqB - freqA;
        });

        for (int num : numbers) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString());
    }
}