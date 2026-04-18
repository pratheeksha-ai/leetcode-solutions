class Solution(object):
    def differenceOfSum(self, nums):
        ele_sum=0;
        difsum=0;
        dig_sum=0;
        for num in nums:
           ele_sum=ele_sum+num
           temp=num;
           while(temp>0):
            digit=temp%10;
            dig_sum=dig_sum+digit;
            temp=temp//10;
        difsum=ele_sum-dig_sum;
        return abs(difsum);
