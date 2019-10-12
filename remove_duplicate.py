class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        index=0
        cur = 0
        while(index<len(nums)):
            if nums[cur] == nums[index]:
                index+=1
            else:
                cur+=1;
                nums[cur]=nums[index]
                index+=1       
        return cur+1