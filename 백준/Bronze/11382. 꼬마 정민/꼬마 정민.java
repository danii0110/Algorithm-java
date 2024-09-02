import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] arr = br.readLine().split(" ");
        long[] nums = new long[3];
        long res = 0;
        
        for(int i = 0; i < 3; i++) {
            nums[i] = Long.parseLong(arr[i]);
            res += nums[i];
        }
        System.out.print(res);
    }
}