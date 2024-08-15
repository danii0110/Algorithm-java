class Solution {
    public static String solution (String str1, String str2) {
        String ans = "";
        
        int n = (str1.length() > str2.length() ? str1.length() : str2.length());
        
        for(int i = 0; i < n; i++) {
            ans += str1.charAt(i);
            ans += str2.charAt(i);
        }
        
        return ans;
    }
}