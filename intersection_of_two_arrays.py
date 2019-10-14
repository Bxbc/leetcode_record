class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        self.ret = []
        if(len(nums1)<len(nums2)):
            for i in nums1:
                if i in nums2:
                    self.ret.append(i)
                    nums2.remove(i)
        else:
            for j in nums2:
                if j in nums1:
                    self.ret.append(j)
                    nums1.remove(j)
        return self.ret