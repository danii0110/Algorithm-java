class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] ans = new int[str.length()];
        
        int idx = 0;
        while (n > 0) {
            ans[idx++] = (int)(n%10);
            n /= 10;
        }
        return ans;
    }
}