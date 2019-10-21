package leetcode;

class hamming_distance {
    public int hammingDistance(int x,int y) {
        char[] ham = Integer.toBinaryString(x^y).toCharArray();
        int count = 0;
        for(int i=0;i<ham.length;i++){
            if(ham[i] == '1'){
                count++;
            }
        }
        return count;
    }
}
