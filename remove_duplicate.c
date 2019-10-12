int removeDuplicates(int* nums, int numsSize){
    if(numsSize == 0){
        return 0;
    }
    int index = 0;
    int cur = 0;
    while(index<numsSize){
        if(nums[cur]==nums[index]){
            index++;
        }else{
            cur++;
            nums[cur]=nums[index++];
        }
    }
    return cur+1;
}