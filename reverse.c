//
//  reverse.c
//  
//
//  Created by 毕熙 on 2019/10/16.
//

#include <stdio.h>
#include <math.h>

int reverse(int x){
    int sign = 0;
    long int reve = 0;
    int digit= 0;
    int begin= 0;
    int count= 0;
    int base = 1000000000;
    if(x<0){
        sign = 1;
        base = -base;
    }
    while(x){
        digit = x / base;
        if(digit != 0){
            begin = 1;
        }
        x %= base;
        base /= 10;
        if(begin == 1){
            reve += digit*pow(10,count);
            count++;
        }
    }
    if(sign == 0){
        if(reve>pow(2,31)-1){
            return 0;
        }
        return reve;
    }else{
        if(reve>pow(2,31)){
            return 0;
        }
        return -reve;
    }
}
int main(){
    int x = reverse(-2648);
    printf("%d\n",x);
}
