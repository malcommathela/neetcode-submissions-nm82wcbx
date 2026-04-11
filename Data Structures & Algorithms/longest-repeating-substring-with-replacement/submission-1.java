class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        int l = 0;
        int n = s.length();
        int maxFreq = 0;
        int[] freq = new int[26];
        
        for (int r = 0; r < n; r++) {
            int idx = s.charAt(r) - 'A';
            freq[idx]++;
            maxFreq = Math.max(maxFreq, freq[idx]);

            while ((r - l + 1) - maxFreq > k) {
                int leftIdx = s.charAt(l) - 'A';
                freq[leftIdx]--;
                l++;
            }
            ans = Math.max(ans, r - l + 1);

        }

        return ans;
        
    }
}
