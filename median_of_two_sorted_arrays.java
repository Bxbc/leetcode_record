package leetcode;


import java.security.InvalidParameterException;

// O(log(min(m+n))
class median_of_two_sorted_arrays {
    public double findMedianSortedArrays(int[] nums1,int[] nums2) {
        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);
        int m = nums1.length;
        int n = nums2.length;
        int odd = ((m+n)%2!=0)?1:0;
        int cutm,cutn,leftmostm,leftmostn,rightmostm,rightmostn;
        int leftmax,rightmin;
        int pos1,pos2;
        int half;
        pos1 = 0;
        pos2 = m;
        half = (m+n)/2+odd;
        while(pos1<=pos2){
            cutm = (pos1+pos2)/2;
            cutn = half - cutm;
            leftmostm = (cutm==0)?Integer.MIN_VALUE:nums1[cutm-1];
            rightmostm = (cutm==m)?Integer.MAX_VALUE:nums1[cutm];
            leftmostn = (cutn==0)?Integer.MIN_VALUE:nums2[cutn-1];
            rightmostn = (cutn==n)?Integer.MAX_VALUE:nums2[cutn];
            leftmax = Math.max(leftmostm,leftmostn);
            rightmin = Math.min(rightmostm,rightmostn);
            if(leftmax<=rightmin){
                if(odd==1) return (double)leftmax;
                else return (double)(leftmax+rightmin)/2;
            }else if(leftmostm>rightmostn) {              // Do the binary search
                pos2 = cutm - 1;   // increase right and decrease left
            }else{
                pos1 = cutm + 1;
            }
        }
        return -1;
    }
}
