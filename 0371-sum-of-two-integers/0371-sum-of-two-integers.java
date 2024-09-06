class Solution {
    public int getSum(int a, int b) {

        // int temp = 0;

        while(b!=0){

            int sum = a ^ b;
            int carry = (a&b) << 1;
            a = sum;
            b = carry;
        }
        return a;  
    }
}