public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ret = 0;
        long a = Integer.toUnsignedLong(n);
        for(int i = 0; i < 32; i++){
            if((a & (long)(Math.pow(2, i))) != 0){
                ret++;
            }
        }
        return ret;
    }
}
