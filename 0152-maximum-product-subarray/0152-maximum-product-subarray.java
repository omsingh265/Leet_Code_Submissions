// class Solution {
//     public int maxProduct(int[] nums) {
        
//         int max = Integer.MIN_VALUE;
//         int n = nums.length;
//         int prefix = 1, suffix = 1;
        
//         for(int i = 0; i< n; i++){

//             if(prefix == 0){    //initializing prefix to 1 if 0 comes in between multiplication
//                 prefix = 1;
//             }
//             if(suffix == 0){    //initializing suffix to 1 if 0 comes in between multiplication
//                 suffix = 1;
//             }
//             prefix *= nums[i];    //calculating prefix
//             suffix *= nums[n-i-1];  //calculating suffix
//             max = Math.max(max,Math.max(prefix,suffix));  //checking and storing max between suffix and prefix
//         }
//         return max;
//     }    
// }
            
            
class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);
            
            result = Math.max(result, maxProduct);
        }
        
        return result;
    }
}




    
