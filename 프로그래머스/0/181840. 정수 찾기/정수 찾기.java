class Solution {
    public int solution(int[] num_list, int n) {
        boolean isTrue = false;
        for(int num : num_list) {
            if (num == n) {
                isTrue = true;
            }
        }
        return isTrue ? 1 : 0;
    }
}