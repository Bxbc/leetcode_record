package leetcode;


// This method violate the time limits.
class divide_two_integers {
    public int divide(int dividend,int divisor) {
        if(divisor==0) return Integer.MAX_VALUE;
        int count = 0;
        if(dividend>=0 && divisor>0){
            while(dividend>=divisor){
                dividend = dividend - divisor;
                if(count==Integer.MAX_VALUE) return count;
                count++;
            }
        }else if(dividend<=0 && divisor<0){
            while(dividend <= divisor){
                dividend = dividend - divisor;
                if(count==Integer.MAX_VALUE) return count;
                count++;
            }
        }else if(dividend>=0 && divisor<0){
            while(dividend + divisor>=0){
                dividend = dividend + divisor;
                if(count==Integer.MIN_VALUE) return count;
                count--;
            }
        }else{
            while(dividend+divisor<=0){
                dividend = dividend + divisor;
                if(count==Integer.MIN_VALUE) return count;
                count--;
            }
        }
        return count;
    }
}

// Should use the bit-oriented operation
// According to the m*divisor = dividend - remainder
// Belows method violate the time limits as well

class divide_two_integers_OP {
    public int divide_op(int dividend,int divisor) {
        if(divisor==0) return Integer.MAX_VALUE;
        if(divisor==1) return dividend;
        if(dividend == Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        boolean sign = (dividend<0)^(divisor<0);
        if(dividend<0) dividend = -dividend;
        if(divisor<0) divisor = -divisor;
        int m=0;
        int n=0;
        while((divisor<<m)<dividend){
            m++;
        }
        for(int i=m;i>=0;i--){
            if((divisor<<i)>dividend) continue;
            n |= (1<<i); // equals to n = n + 2^ii
            dividend -= (divisor<<i); //equals to dividend = dividend - divisor*2^i
        }
        if(sign) return -n;
        return n;
    }
}

// rewrite the function
class divide_two_integers_OP2 {
    public int divides(int dividend,int divisor) {
        if(divisor==0) return (1<<31)-1;
        if(divisor==1) return dividend;
        if(dividend == (1<<31) && divisor==-1) return (1<<31)-1;
        boolean sign = (dividend<0)^(divisor<0);
        if(dividend<0) dividend = ~dividend+1;
        if(divisor<0) divisor = ~divisor+1;
        int n = 0;
        int m = 31;
        for(;m>=0;m--){
            if((dividend>>>m)-divisor>=0){ // If the divisor is equal to Integer.MIN_VALUE,
                                            // remember not compare it directly
                n |= 1<<m;
                dividend -= divisor<<m;
            }
        }
        return (sign)?-n:n;
    }
}

class bit_add {
    public int addBits(int m,int n) {
        if(n==0) return m;
        int nums = m^n;
        int carry = (m&n)<<1;
        return addBits(nums,carry);
    }
}

// Some tips:
// -n = ~(n-1) = ~n + 1
// to get the integer n's last '1', use: n&-n=n&~(n-1)
// Remove n's last '1', use: n&(n-1)
