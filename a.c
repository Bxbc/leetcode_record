#include <stdio.h>
#include <stdlib.h>
#include <string.h>


char * countAndSay(int n){
    char* strs = NULL;
    char* temp = NULL;
    strs = (char*)malloc(sizeof(char)*4693);
    temp = (char*)malloc(sizeof(char)*4693);
    strs[0] = '1';
    strs[1] = '\0';
    for(int i=1;i<n;i++){
        strcpy(temp,strs);
        int len = strlen(temp);
        int count = 1;
        int index = 0;
        for(int j=0;j<len;j++){
            if(len>j+1){
                if(temp[j]==temp[j+1]){
                    count++;
                }else{
                    strs[index++] = count+'0';
                    strs[index++] = temp[j];
                    count = 1;
                }
            }else{
                strs[index++]=count+'0';
                strs[index++]=temp[j];
                strs[index] = '\0';
            }
        }
    }
    return strs;
}

int main(){
    int i=1;
    for(int n=1;n<30;n++){
        char *s = countAndSay(n);
        printf("%s\n",s);
        i++;
        printf("%d\n",i);
    }
    return 0;
}
