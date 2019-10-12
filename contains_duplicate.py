class Solution:
    def containsDuplicate(self, nums:List[int]) -> bool:
        self.sets = set(nums)
        return (len(self.sets) != len(nums))