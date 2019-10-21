package leetcode;

class number_of_one_bits {
    public int hammingWeight(int n) {
//        int count = Integer.bitCount(n);
//        return count;
        int bits = 1;
        int count = 0;
        for(int i=0;i<32;i++){
            if((n&bits) != 0){
                count++;
            }
            bits = bits<<1;
        }
        return count;
    }
}
