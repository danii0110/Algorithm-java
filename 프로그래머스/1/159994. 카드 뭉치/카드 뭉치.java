import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> list1 = new LinkedList<>(Arrays.asList(cards1));
        List<String> list2 = new LinkedList<>(Arrays.asList(cards2));
        
        for (String word : goal) {
            if(!list1.isEmpty() && list1.get(0).equals(word)) {
                list1.remove(0);
            } else if (!list2.isEmpty() && list2.get(0).equals(word)) {
                list2.remove(0);
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}