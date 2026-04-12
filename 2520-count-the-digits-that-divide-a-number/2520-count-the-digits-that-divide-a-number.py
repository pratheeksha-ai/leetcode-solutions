class Solution(object):
    def countDigits(self, num):
        count=0
        digit=0;
        original=num;
        while(num>0):
            digit=num%10
            if(original%digit==0):
                count=count+1
            num=num/10;
        return count