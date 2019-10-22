package leetcode;

/**
 * scanning from the first bit of n and
 * recording the bit to the ret from left to right
 */

class reverse_bits {
    public int reverseBits(int n) {
        int ret = 0;
        for(int i=0;i<32;i++){
            if((n&1)== 1){
                ret = (ret<<1) + 1;
            }else{
                ret = ret<<1;            // recording on ret from left to right
            }
            n = n>>1;                   // scanning n from right to left
        }
        return ret;
    }
}
