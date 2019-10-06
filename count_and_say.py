# python 3.7

class Solution:
    def countAndSay(self, n: int) -> str:
        finalstr = ['1']
        count = 1
        num = n
        while(count < num):
            strs = finalstr
            finalstr = []
            amount = 1
            while(len(strs)!=0):
                temp = strs.pop(0)
                if(len(strs)!=0):
                    if(temp == strs[0]):
                        amount+=1
                    else:
                        finalstr.append(str(amount))
                        finalstr.append(str(temp))
                        amount = 1
                else:
                    finalstr.append(str(amount))
                    finalstr.append(str(temp))
                    break
            count += 1
        return ''.join(finalstr)