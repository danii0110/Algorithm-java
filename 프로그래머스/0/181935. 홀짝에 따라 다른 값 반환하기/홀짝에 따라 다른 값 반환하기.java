class Solution {
    public int solution(int n) {
        int ans = 0;
        
        if (n % 2 == 1) {
            // n 이하의 홀수인 모든 양의 정수의 합
            for (int i = 1; i <= n; i += 2) {
                ans += i;
            }
        } else {
            // n 이하의 짝수인 모든 양의 정수의 제곱의 합
            for (int i = 2; i <= n; i += 2) {
                ans += i * i;
            }
        }
        return ans;
    }
}