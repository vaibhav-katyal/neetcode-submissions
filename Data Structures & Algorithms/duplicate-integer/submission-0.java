class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();


        for(int n:nums){
            mpp.put(n, mpp.getOrDefault(n,0)+1);
        }

        for(int n:nums){
            if(mpp.get(n) >1) return true;

        }

        return false;
    }
}