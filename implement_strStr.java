package leetcode;

class implement_strStr {
    public int strStr(String haystack, String needle){
        if(needle == null || needle.length()==0){
            return 0;
        }
        if(haystack.length()<needle.length()){
            return -1;
        }
        if(haystack.length() == needle.length()){
            if(haystack.equals(needle)){
                return 0;
            }else{
                return -1;
            }
        }
        int hl = haystack.length();
        int nl = needle.length();
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        int index,count;
        for(int i=0;i<haystack.length();i++){
            if(h[i]==n[0]){
                index = i;
                count = 0;
                while(index<haystack.length() && count < needle.length()){
                    if(h[index]==n[count]){
                        index++;
                        count++;
                    }else{
                        break;
                    }
                }
                if(count == needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}
