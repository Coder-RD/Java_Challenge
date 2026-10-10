class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        // Assume the first string is the longest common prefix
        String prefix = strs[0];
        
        // Compare the prefix with each subsequent string in the array
        for (int i = 1; i < strs.length; i++) {
            // While the current string does not start with the prefix,
            // shorten the prefix by one character from the end
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        
        return prefix;
    }
}