int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int* returns = (int*)malloc(sizeof(int)*2);
    returns[0] = 0;
    returns[1] = 0;
    for(int i =0;i<numsSize;i++){
        for(int j = 0;j<numsSize && j != i;j++){
            if(nums[i]+nums[j]==target){
                returns[0] = i;
                returns[1] = j;
                *returnSize = 2;
                return returns;
            }
        }
    }
    return returns;
}