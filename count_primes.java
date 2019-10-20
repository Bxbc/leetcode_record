package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class count_primes {
    public int countPrimes(int n){
        boolean isPrime[] = new boolean[n];
        int j = 0;
        int count = 0;
        for(int i=2;i<(int)Math.sqrt(n)+1;i++){
            j=i;
            while(i*j<n){
                isPrime[i*j] = true;
                j++;
            }
        }
        for(int i=2;i<n;i++){
            if(!isPrime[i]){
                count++;
            }
        }
        return count;
    }
}
