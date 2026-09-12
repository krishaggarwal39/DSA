class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        for ( int i = 0 ; i < nums.length ; i++){
            sum = sum + nums[i];
            if ( sum == k ){
                count++;
            }
        }
    }
        int count = 0;
                sum = 0;
        return count;
}