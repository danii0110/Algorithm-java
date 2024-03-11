import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        //단어 S 입력받음
        String S = br.readLine();

        //각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(arr[c - 97] == -1) {
                arr[c - 97] = i;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}