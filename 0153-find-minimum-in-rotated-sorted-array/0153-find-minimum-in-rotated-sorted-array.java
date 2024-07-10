class Solution {
    public int findMin(int[] nums) {

    /*
    This is the brute -force approach with o(n)
    */
        // int n = nums.length; // size of the array.
        // int mini = Integer.MAX_VALUE;
        // for (int i = 0; i < n; i++) {
        //     // Always keep the minimum.
        //     mini = Math.min(mini, nums[i]);
        // }
        // return mini;


/*
this is using binary search with o(log N)
*/
    int n = nums.length;
    int min = Integer.MAX_VALUE;
    int low = 0, high = n-1;

    while( low <= high ){
    int mid = low +(high-low)/2;

        if(nums[low] <= nums[mid]){
            min = Math.min(min, nums[low]);
            low = mid + 1;
        }
        else{
            min = Math.min(min, nums[mid]);
            high = mid - 1;
        }
    }
        return min;
    }

}