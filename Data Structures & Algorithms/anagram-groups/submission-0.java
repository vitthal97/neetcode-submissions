class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List result = new ArrayList<>();
        Map<String, List<String>> hm = new HashMap<String, List<String>>();
        for(String str: strs) {

            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);

            hm.putIfAbsent(sortedStr, new ArrayList<>());
            hm.get(sortedStr).add(str);
        }
        return new ArrayList<>(hm.values());

    }

    private boolean isValidAnagram(String s, String t) {

        if(s.length()!=t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
    }
}
