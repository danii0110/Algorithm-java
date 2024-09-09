import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        
        int num1 = Integer.parseInt(new StringBuilder(nums[0]).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(nums[1]).reverse().toString());
        
        System.out.print(Math.max(num1, num2));
    }
}