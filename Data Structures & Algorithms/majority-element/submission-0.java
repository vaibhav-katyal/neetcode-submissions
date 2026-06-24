class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i:nums){
            mpp.put(i, mpp.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer>e:mpp.entrySet()){
            if(e.getValue() > nums.length/2){
                return e.getKey();
            }
        }

        return -1;
    }
}