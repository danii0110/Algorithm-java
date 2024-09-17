import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] ans = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;
            
            int[] temp = Arrays.copyOfRange(array, start, end);
            Arrays.sort(temp);
            
            ans[i] += temp[k];
        }
        
        return ans;
    }
}
// commands[i]번 반복
// 배열 i ~ j 자르기
// 정렬하기
// k번째 수 출력