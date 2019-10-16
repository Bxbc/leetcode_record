//
//  first_unique_character_in_string.c
//  
//
//  Created by 毕熙 on 2019/10/16.
//

#include <stdio.h>
#include <string.h>

int firstUniqChar(char * s){
    int lenth = strlen(s);
    int count[26] = {0};
    int index = 0;
    for(int i=0;i<lenth;i++){
        count[s[i]-'a']++;
    }
    for(int i=0;i<lenth;i++){
        if(count[s[i]-'a']==1){
            return i;
        }
    }
    return -1;
}

int main(){
    char *s = "loveleetcode";
    int a = firstUniqChar(s);
    printf("%d\n",a);
}
