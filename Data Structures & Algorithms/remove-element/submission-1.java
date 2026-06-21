class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int [] newarr = new int[n];

        int k = 0;

        for(int i=0; i<n; i++){
            if(nums[i] != val){
                newarr[k] = nums[i];
                k++;
            }
        }

        for(int i=0; i<n; i++){
            nums[i] = newarr[i];
        }

        return k;
    }
}