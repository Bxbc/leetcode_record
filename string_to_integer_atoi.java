package leetcode;

public class string_to_integer_atoi {
    public int myAtoi(String str){
        int sign = 1;
        int lens = str.length();
        StringBuilder catc = new StringBuilder();
        int count = 0;
        int begin = 0;
        char[] numbs = str.toCharArray();
        for(int i=0;i<lens;i++){
            while(i<lens-1 && begin == 0){
                if(numbs[i] == ' '){
                    i++;
                    continue;
                }else{
                    break;
                }
            }
            if(numbs[i] == '-' && begin == 0){
                count++;
                begin = 1;
                sign *= -1;
                continue;
            }
            if(numbs[i]== '+' && begin == 0){
                count++;
                sign *= 1;
                begin = 1;
                continue;
            }
            if(count>1){
                return 0;
            }
            begin = 1;
            if(numbs[i]-'0'>= 0 && numbs[i]-'0'<=9 && begin==1){
                if(numbs[i]-'0'==0 && catc.length() == 0){
                    continue;
                }
                catc.append(numbs[i]);
            }else{
                if(catc.length() == 0){
                    return 0;
                }else{
                    break;
                }
            }
        }
        if(catc.length() == 0){
            return 0;
        }else if(catc.length()>10){
            if(sign == 1){
                return 2147483647;
            }
            return -2147483648;
        }else{
            if(sign == -1){
                catc.insert(0,'-');
            }
            String temp = new String(catc);
            long a = Long.parseLong(temp);
            if(a>=0){
                if(a>2147483647){
                    return 2147483647;
                }
                return Integer.parseInt(temp);
            }else{
                if(a<-2147483648){
                    return -2147483648;
                }
                return Integer.parseInt(temp);
            }
        }
    }
}
