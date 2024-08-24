class Solution {
    public int solution(int number, int n, int m) {
        int ans  = number % n == 0 && number % m == 0 ? 1 : 0;
        return ans;
    }
}