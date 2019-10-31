package leetcode;

class longest_palindromic_substring {
    public String longestPalindrome(String s) {
        int len = s.length();
        StringBuilder pal = new StringBuilder();
        int m,n,l,k,tem1,tem2,size;
        size = 0;
        for(int i=0;i<len;i++){
            m = n = l = i;
            k = i + 1;
            tem1 = tem2 = 0;
            for(;m>=0 && n<len;){
                if(s.charAt(m)==s.charAt(n)){
                    m--;
                    n++;
                    tem1++;
                }else{
                    break;
                }
            }
            for(;l>=0 && k<len;){
                if(s.charAt(l)==s.charAt(k)){
                    l--;
                    k++;
                    tem2++;
                }
                else{
                    break;
                }
            }
            tem1 = 2*tem1 - 1;
            tem2 = 2*tem2;
            if(tem1<tem2){
                tem1 = tem2;
                m = l;
                n = k;
            }
            if(tem1>size){
                pal.delete(0,size);
                size = tem1;
                for(int j=m+1;j<n;j++){
                    pal.append(s.charAt(j));
                }
            }
        }
        return pal.toString();
    }
}
