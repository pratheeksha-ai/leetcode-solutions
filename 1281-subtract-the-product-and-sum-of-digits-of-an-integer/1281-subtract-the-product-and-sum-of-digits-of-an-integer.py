class Solution(object):
    def subtractProductAndSum(self, n):
        sums=0
        products=1
        while(n>0):
            digit=n%10;
            sums=sums+digit;
            products=products*digit;
            n=n/10;
        result=products-sums;
        return result