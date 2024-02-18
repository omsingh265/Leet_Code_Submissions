class Solution {
    public boolean canJump(int[] nums) {

        int steps = 0;

        for(int i=0; i<=nums.length-1;i++){
            
            if(i > steps){
                return false;
            }
            steps = Math.max(steps, i+nums[i]);

        }
        return true;
        
    }
}