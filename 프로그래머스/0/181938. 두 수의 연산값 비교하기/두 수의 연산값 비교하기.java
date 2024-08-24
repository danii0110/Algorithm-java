class Solution {
    public int solution (int a, int b) {
        int add = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int mul = 2 * a * b;
        
        int ans = add > mul ? add : mul;
        
        return ans;
    }
}