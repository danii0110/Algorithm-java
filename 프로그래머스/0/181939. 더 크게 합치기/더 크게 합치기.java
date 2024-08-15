class Solution {
    public int solution(int a, int b) {
        int ans = 0;
        String n1 = Integer.toString(a) + Integer.toString(b);
        String n2 = Integer.toString(b) + Integer.toString(a);
        
        int a1 = Integer.parseInt(n1);
        int a2 = Integer.parseInt(n2);
        
        ans = (a1 > a2 ? a1 : a2);
        
        return ans;
    }
}