class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        self.count = 0
        while(0 in nums):
            self.count += 1
            nums.remove(0)
        for _ in range(self.count):
            nums.append(0)
        return nums