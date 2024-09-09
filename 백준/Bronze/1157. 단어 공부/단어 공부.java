import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int[] freq = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'A']++;
        }
        
        int maxFreq = -1;
        char maxChar = '?';
        boolean isDuplicate = false;
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) (i + 'A');
                isDuplicate = false;
            } else if (freq[i] == maxFreq) {
                isDuplicate = true;
            }
        }
        
        if (isDuplicate) System.out.print("?");
        else System.out.print(maxChar);
    }
}