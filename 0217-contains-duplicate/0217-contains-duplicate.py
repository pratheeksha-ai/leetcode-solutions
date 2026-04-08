class Solution(object):
    def containsDuplicate(self, nums):
        arr=list(set(nums))
        if(len(arr)!=len(nums)):
            return True
        else:
            return False
        