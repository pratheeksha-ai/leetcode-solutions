class Solution(object):
    def differenceOfSums(self, n, m):
        sums=0
        num=0
        for i in range(1,n+1):
            if(i%m==0):
                sums=sums+i
            else:
                num=num+i
        total=num-sums
        return total
        