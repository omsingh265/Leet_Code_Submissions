class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer
     */
    function maxSubArray($nums) {
        
        $sum = 0;
        $max = $nums[0];
        
        for($i = 0;$i<count($nums);$i++){
            $sum += $nums[$i];
            if($sum > $max)
                $max = $sum;
            if($sum <0)
                $sum = 0;
        }
        return $max;
        
    }
}