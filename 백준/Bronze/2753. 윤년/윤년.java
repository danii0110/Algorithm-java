import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        
        int res = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? 1 : 0);
        System.out.print(res);
    }
}