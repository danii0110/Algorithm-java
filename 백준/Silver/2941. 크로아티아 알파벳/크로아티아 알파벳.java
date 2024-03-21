import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        String[] replace = {"1", "2", "3", "4", "5", "6", "7", "8"};
        
        for (int i = 0; i < cro.length; i++) {
            if (str.contains(cro[i])) {
                str = str.replace(cro[i], replace[i]);
            }
        }

        System.out.println(str.length());
    }
}
