class Solution {
    public int solution(int[] wallet, int[] bill) {
        int ans = 0;
        
        int walletLower = Math.min(wallet[0], wallet[1]);
        int walletUpper = Math.max(wallet[0], wallet[1]);
        
        int billLower = Math.min(bill[0], bill[1]);
        int billUpper = Math.max(bill[0], bill[1]);
        
        while(billLower > walletLower || billUpper > walletUpper) {
            if (billUpper > billLower) {
                billUpper /= 2;
             } else {
                billLower /= 2;
            }
            int tempLower = Math.min(billLower, billUpper);
            int tempUpper = Math.max(billLower, billUpper);
            
            billLower = tempLower;
            billUpper = tempUpper;
            
            ans++;
        }
        
        return ans;
    }
}