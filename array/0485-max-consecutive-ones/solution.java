class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_counter = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                max_counter = Math.max(count , max_counter);
            }
            else{
                count = 0;
            }

        }
        return max_counter;
    }
}