class Solution(object):
    def sortedSquares(self, nums):
        arr=[]
        for i in range(0,len(nums)):
            squares=nums[i]*nums[i]
            arr.append(squares)
        arr.sort()
        return arr

        