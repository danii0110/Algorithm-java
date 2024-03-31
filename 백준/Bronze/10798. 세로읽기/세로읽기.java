import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][];
        
        for(int i = 0; i < 5; i++) {
            String line = br.readLine();
            arr[i] = new char[line.length()];
            for(int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int y = 0; y < 15; y++) {
            for(int x = 0; x < 5; x++) {
                if(y < arr[x].length) {
                    sb.append(arr[x][y]);
                }
            }
        }
        System.out.println(sb);
    }
}
