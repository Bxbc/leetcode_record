#include <stdbool.h>

bool isAnagram(char * s, char * t){
    int len = strlen(s);
    if(len != strlen(t)){
        return false;
    }
    int count1[26] = {0};
    int count2[26] = {0};
    for(int i=0;i<len;i++){
        count1[s[i]-'a']++;
        count2[t[i]-'a']++;
    }
    for(int i=0;i<26;i++){
        if(count1[i] != count2[i]){
            return false;
        }
    }
    return true;
}