//
//  valid_palindrome.c
//  
//
//  Created by 毕熙 on 2019/10/16.
//

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>



bool isPalindrome(char * s){
    int len = strlen(s);
    if(len==0 || len==1){
        return true;
    }
    for(int i=0,j=len-1;i<j;i++,j--){
        while(!(s[i]-'0'>=0 && s[i]-'0'<=9) && !(s[i]-'0'>=17 && s[i]-'0'<=42) && !(s[i]-'0'>=49 && s[i]-'0'<=74)){
            i++;
//            printf("%d,%d\n",i,j);
            if(i>=len-1){
                break;
            }
        }
        while(!(s[j]-'0'>=0 && s[j]-'0'<=9) && !(s[j]-'0'>=17 && s[j]-'0'<=42) && !(s[j]-'0'>=49 && s[j]-'0'<=74)){
            j--;
//            printf("%d\n",s[j]-'0');
//            printf("%c\n",s[j]);
            if(j<=0){
                break;
            }
        }
//        printf("%d,%d\n",i,j);
        if(s[i]-'0'>=0 && s[i]-'0'<=9){
            if(s[i]!=s[j]){
                return false;
            }
        // s[i] belongs to characters
        }else if((s[i]-'0'>=17 && s[i]-'0'<=42) || (s[i]-'0'>=49 && s[i]-'0'<=74)){
            if((s[j]-'0'>=17 && s[j]-'0'<=42) || (s[j]-'0'>=49 && s[j]-'0'<=74)){
                if(abs(s[i]-s[j])!=32 && s[i]!=s[j]){
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return true;
        }

    }
    return true;
}

int main(){
    char *s = "A man, a plan, a canal: Panama";
    char *s2 = ".,";
    char *s3 = "Sore was I ere I saw Eros.";
    if(isPalindrome(s3)){
        printf("ok\n");
    }else{
        printf("No\n");
    }
}
