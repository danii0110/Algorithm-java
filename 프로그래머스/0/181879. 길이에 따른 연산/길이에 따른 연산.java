class Solution {
    public int solution(int[] num_list) {
        int ans;
        if (num_list.length >= 11) {
            ans = 0;
            for (int i = 0; i < num_list.length; i++) {
                ans += num_list[i];
            }
        } else {
            ans = 1;
            for (int i = 0; i < num_list.length; i++) {
                ans *= num_list[i];
            }
        }
        
        return ans;
    }
}