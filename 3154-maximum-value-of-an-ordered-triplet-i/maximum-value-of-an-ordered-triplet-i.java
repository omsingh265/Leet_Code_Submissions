class Solution {
    public long maximumTripletValue(int[] nums) {

        int n = nums.length;
        long result = 0;
        long maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    maxSum = (long)(nums[i] - nums[j]) * nums[k];
                    if (maxSum > result) {
                        result = maxSum;
                    }
                }
            }
        }
        if(result <0){
            return 0;
        }

        return result;
    }
}