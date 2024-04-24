class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for (int i =0; i<n;i++){
            int a = nums[i];
            int j = target-a;
            if(map.containsKey(j)){
                return new int[]{map.get(j), i};
            }
            map.put(a,i);
        }
        return null;  
    }
}