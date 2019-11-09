package leetcode;

/**
 * As Buckets effect reveals, the capacity of a bucket
 * depends on the shortest board.
 * So we start at the both endpoints and add
 * the shortest side
 */
class container_with_most_water {
    public int maxArea(int[] height) {
        if(height.length==0 || height.length==1) return 0;
        int begin = 0;
        int end = height.length-1;
        int contain = 0;
        while(begin<end){
            contain = Math.max(contain,Math.min(height[begin],height[end])*(end-begin));
            if(height[begin]<height[end]) begin++;
            else end--;
        }
        return contain;
    }
}
