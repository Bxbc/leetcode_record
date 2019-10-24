#include <stdio.h>


// Having two states and two choices
// hold the stock or not hold the stock
// choose to buy or choose to sell
// having two trends-> increasing or decreasing

int maxProfit(int *prices,int pricesSize){
    if(pricesSize == 0){
        return 0;
    }
    int profit[pricesSize];
    int balance = 0;
    int hold = 0; // 1  means current state is owning the stock
    for(int i=0;i<pricesSize;i++){
        if(i<pricesSize-1){
            if(prices[i+1]>=prices[i]){
                if(hold == 0){
                    hold = 1;
                    balance = balance - prices[i];
                }
            }else{
                if(hold == 1){
                    hold = 0;
                    balance = balance + prices[i];
                }
            }
        }else{
            if(hold == 1){
                balance = balance + prices[i];
            }
        }
    }
    return balance;
}

int main(){
    int a[] = {7,1,5,3,6,4};
    int p = maxProfit(a,6);
    printf("%d\n",p);
}
