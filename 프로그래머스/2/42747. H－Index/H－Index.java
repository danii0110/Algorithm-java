import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 인용 횟수를 정렬
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int h = n - i; // 현재 h는 남은 논문 수
            if (citations[i] >= h) {
                return h; // 조건을 만족하는 최댓값을 찾으면 반환
            }
        }
        
        return 0; // H=Index를 찾지 못한 경우 0 반환
    }
}