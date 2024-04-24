class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int n = nums.length;
        
        HashSet<Integer> set = new HashSet<>();
        
         for (int i = 0; i<n;i++){
             set.add(nums[i]);
         }
        
        if(set.size() < nums.length){
            return true;
        }
        else{
            return false;
        }
        //     for(int j = i+1;j<n;j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
}
}