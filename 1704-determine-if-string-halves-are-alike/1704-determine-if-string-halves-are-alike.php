class Solution {

    /**
     * @param String $s
     * @return Boolean
     */
    function halvesAreAlike($s) {

        $s1 = strlen($s);
        $left = 0;
        $right = 0;
        
        $s2 = $s1/2;

        $vow = ['a','e','i','o','u','A','E','I','O','U'];

        for($i=0, $j=$s2; $i<$s2, $j<$s1; $i++, $j++){ //loops to start from 0th and mid of the even string
            if(in_array($s[$i], $vow)){
                $left++;
            }
            if(in_array($s[$j], $vow)){
                $right++;
            }
        }

        return ($left == $right);
        
    }
}