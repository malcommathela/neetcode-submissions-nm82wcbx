class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] window = new int[26];
        int[] need = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            need[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        if (match(window, need)) return true;

        for (int r = s1.length(); r < s2.length(); r++) {
            window[s2.charAt(r) - 'a']++;
            window[s2.charAt(r - s1.length())- 'a']--;

            if (match(window, need)) return true;
        }

        return false;
        
    }

    private boolean match(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
