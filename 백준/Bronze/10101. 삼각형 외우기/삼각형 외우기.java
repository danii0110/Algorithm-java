import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        int total = 0;
        
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            total += arr[i];
        }
        if (total != 180) System.out.print("Error");
        else if (arr[0] == arr[1] && arr[0] == arr[2]) System.out.print("Equilateral");
        else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]) System.out.print("Isosceles");
        else System.out.print("Scalene");
    }
}