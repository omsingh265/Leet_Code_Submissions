class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0;i<nums.length;i++){
            Set<Integer> hashSet = new HashSet<>();
            for(int j =i+1;j<nums.length;j++){

                int third = -(nums[i]+nums[j]);

                if(hashSet.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
                    temp.sort(null);
                    set.add(temp);
                }
                hashSet.add(nums[j]);
            }
        }
            List<List<Integer>> result = new ArrayList<>(set);
            return result;
    }
}