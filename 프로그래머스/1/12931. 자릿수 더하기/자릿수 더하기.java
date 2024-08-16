import java.util.*;
class Solution {
    public int solution (int n) {
        int ans = 0;
        String s = Integer.toString(n);
        
        for(int i = 0; i < s.length(); i++) {
            ans += Integer.parseInt(s.substring(i, i + 1));
        }
        
        return ans;
    }
}