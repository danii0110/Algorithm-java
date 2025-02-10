class Solution {
    boolean solution(String s) {
        int count = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') count++;
            else {
                count--;
                if (count < 0) return false;
            }
        }
        
        return count == 0;
    }
}