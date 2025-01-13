class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int sum = 0;

        for (int num : num_list) {
            product *= num;
            sum += num;
        }

        if (product < sum * sum) {
            return 1;
        } else {
            return 0;
        }
    }
}