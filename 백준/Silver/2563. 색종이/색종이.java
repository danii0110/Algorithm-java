import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //색종이의 수 입력받기
        int amount = Integer.parseInt(br.readLine());
        //색칠한 넓이 초기화
        int coloredArea = 0;
        //도화지
        boolean[][] mem = new boolean[101][101];
        
        //개수만큼 영역 입력받기
        for(int i = 0; i < amount; i++) {
            //가로 세로 입력 받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    if(!mem[j][k]) {
                        mem[j][k] = true;
                        coloredArea++;
                    }
                }
            }
        }
        
        System.out.println(coloredArea);
    }
}