class Solution {
    public boolean isPalindrome(String s) {
        
        if(s.isBlank() || s.isEmpty()) {
            return true;
        }

        String str = s;
        String strResult = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return strResult.equals(new StringBuilder(strResult).reverse().toString());
    }
}
