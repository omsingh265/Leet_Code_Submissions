class Solution {
    public int jump(int[] nums) {
        
        int jumps = 0;
        int current = 0; 
        int longest = 0;
        
        int size = nums.length;
        
        for (int i = 0;i<size-1;i++){
            longest = Math.max(longest, nums[i]+i);
            
            if(i == current){
                current = longest;
                jumps++;
            }
        }
        return jumps;
    }
}