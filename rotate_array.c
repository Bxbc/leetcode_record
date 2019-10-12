#include <stdio.h>

void rotate(int* nums, int numsSize, int k){
    k = k % numsSize;
    int temp_1 = 0;
    int temp_2 = 0;
    for(int i=0;i<k;i++){
        temp_1 = nums[0];
        for(int j=1;j<numsSize;j++){
            temp_2 = nums[j];
            nums[j] = temp_1;
            temp_1 = temp_2;
        }
        nums[0] = temp_1;
    }  
}

int main(){
    int a[] = {1};
    int k = 3;
    rotate(a,1,3);
    for(int i=0;i<1;i++){
        printf("%d\n",a[i]);
    }
    return 0;
}