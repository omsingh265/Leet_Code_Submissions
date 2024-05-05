class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        
        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];
        
        leftArray[0] = 1;
        for (int i = 1;i<nums.length;i++){
            leftArray[i] = leftArray[i-1] * nums[i-1];
        }
        rightArray[nums.length-1] = 1;
            for (int i =nums.length-2; i>-1;i--){
                rightArray[i] = rightArray[i+1] * nums[i+1];
            }
        int[] result  = new int[nums.length];
        for (int k = 0; k< nums.length; k++){
            result[k] = leftArray[k] * rightArray[k];
        }
        return result;
        
    }
}