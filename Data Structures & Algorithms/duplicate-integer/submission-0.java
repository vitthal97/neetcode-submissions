class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> noDuplicates = new HashMap<>();
        for(int num: nums) {
            if(noDuplicates.containsKey(num)) {
                return true;
            }
            else {
                noDuplicates.put(num, 1);
            }
        }
        return false;
        
    }
}