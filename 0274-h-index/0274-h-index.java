class Solution {
    public int hIndex(int[] citations) {
        
        int n  = citations.length;
        int [] a = new int[n+1];                      /*creating array with +1 size of                                                            existing array to store the count of                                                           citations for O(n) complexity*/
        for(int c:citations){
            if(c>n)
                a[n]++;
            else{
                a[c]++;
            }
        }
        int count = 0;
        for(int i = n;i>=0;i--){              /*traversing from end of the array*/
            count = count+a[i];
            if(count>=i)
            return i;
        }
        return 0;
    }
}
        
 