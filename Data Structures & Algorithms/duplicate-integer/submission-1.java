class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> mpp = new HashSet<>();


        for(int n:nums){
            if(mpp.contains(n)) return true;

            mpp.add(n);
        }

        return false;
    }
}