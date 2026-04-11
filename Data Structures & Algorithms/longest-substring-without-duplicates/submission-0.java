class Solution {
    public int lengthOfLongestSubstring(String s) {

        int ans = 0;
        int l = 0;
        int r = 0;
        int n = s.length();
        Set<Character> seen = new HashSet<>();

        while (r < n) {
            char c = s.charAt(r);

            if (!seen.contains(c)) {
                seen.add(c);
                r++;
                ans = Math.max(ans, r - l);
            }
            else {
                seen.remove(s.charAt(l));
                l++;
            }
        
        }

        return ans;
        
    }
}
