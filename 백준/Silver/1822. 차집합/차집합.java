import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set<Integer> setA = new HashSet<>();
        
        int aNum = Integer.parseInt(st.nextToken());
        int bNum = Integer.parseInt(st.nextToken());
        
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aNum; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bNum; i++) {
            setA.remove(Integer.parseInt(st.nextToken()));
        }
        
        List<Integer> list = new ArrayList<>(setA);
        Collections.sort(list);
        
        sb.append(list.size()).append("\n");
        for(int l : list) {
            sb.append(l).append(" ");
        }
        System.out.print(sb);
    }
}