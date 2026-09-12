class Solution {
    public int subarraySum(int[] nums, int k) {
        for ( int i = 0 ; i < nums.length; i++){
            for ( int j = i+1 ; j < nums.length; j++){
                if ( nums[i] + nums[j] == k ){
                    count = count  + 1 ;
                }
            }
        }
        int count = 0;
        return count;
    }