class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int cnt = 0;

        for(int n:nums){
            if(cnt == 0){
                candidate = n;
            }

            if(n == candidate) cnt++;
            else if(n != candidate) cnt--;         // cancels out
        }

        return candidate;
    }
}