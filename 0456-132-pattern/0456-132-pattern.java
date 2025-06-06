class Solution {
    public boolean find132pattern(int[] nums) {

        if(nums == null || nums.length < 3)
        return false;
        int third = Integer.MIN_VALUE;
        int n =nums.length;
        Stack<Integer> stack = new Stack<>();
        for(int i =n-1;i>=0;i--){
            if(nums[i] < third){
                return true;
            }

            while(!stack.isEmpty() && nums[i] > stack.peek()){
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
        
    }
}