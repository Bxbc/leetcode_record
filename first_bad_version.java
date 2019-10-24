package leetcode;

class VersionControl {
    public boolean isBadVersion(int n) {
        if(n>=4) return true;
        return false;
    }
}

class first_bad_version extends VersionControl {
    public int fistBadVersion(int n) {
        int mid;
        int begin = 1;
        int end = n;
        while(true){
            mid = begin + (end-begin)/2;
            if(isBadVersion(mid)){
                if(!isBadVersion(mid-1)){
                    return mid;
                }else{
                    end = mid-1;
                }
            }else{
                if(isBadVersion(mid+1)){
                    return mid+1;
                }else{
                    begin = mid+1;
                }
            }
        }
    }
}
