import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();

        int lastAdded = -1;

        for (int num : arr) {
            if (num != lastAdded) {
                queue.add(num);
                lastAdded = num;
            }
        }

        int[] ans = new int[queue.size()];
        int index = 0;
        while (!queue.isEmpty()) {
            ans[index++] = queue.poll();
        }

        return ans;
    }
}