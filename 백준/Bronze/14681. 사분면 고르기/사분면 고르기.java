import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res;
        
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        
        if (x > 0 && y > 0) res = 1;
        else if (x < 0 && y > 0) res = 2;
        else if (x < 0 && y < 0) res = 3;
        else res = 4;
        
        System.out.print(res);
    }
}