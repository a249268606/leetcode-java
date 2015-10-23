public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() ) return false;
        int[] alphabet = new int[26];
        for(int i = 0; i< 26; i++) {
            alphabet[i] = 0;
        }
        for(int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
            if(alphabet[t.charAt(i) -'a'] < 0) return false;
        }
        return true;
    }
}
