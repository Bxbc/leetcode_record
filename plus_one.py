class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        self.digt = list(map(int,list(str(int(''.join(list(map(str,digits)))) + 1))))
        return self.digt