class Solution(object):
    def countKeyChanges(self, s):
        p=s.lower()
        count=0
        for i in range(1,len(p)):
            if p[i]!=p[i-1]:
                count=count+1

        return count
                    