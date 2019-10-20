package leetcode;

class power_of_three {
    public boolean isPowerOfThree(int n){
        if(n<=0){
            return false;
        }
        int greatest = 1162261467; // 1162261467 = (int)Math.pow(3,19) < Integer.MAX_VALUE
        if(greatest % n == 0){
            return true;
        }else{
            return false;
        }
    }
}
