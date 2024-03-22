import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            String[] list = str.split("");

            boolean isGroupWord = true;

            for(int j = 0; j < str.length() - 1; j++) {
                if(list[j].equals(list[j + 1])) {
                    sb.append(list[j]);
                } else if (!(sb.toString().contains(list[j + 1]))) {
                    sb.append(list[j]);
                } else {
                    isGroupWord = false;
                    break;
                }
            }
            if(isGroupWord) count++;
            sb.setLength(0);
        }

        System.out.println(count);
    }
}