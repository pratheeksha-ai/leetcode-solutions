class Solution(object):
    def canAliceWin(self, nums):
        single_sum = 0
        double_sum = 0

        for num in nums:
            if num < 10:
                single_sum = single_sum + num
            else:
                double_sum = double_sum + num

        if single_sum == double_sum:
            return False
        else:
            return True