class Solution {
    public int minimumOperations(int[] nums) {
        int len=nums.length;
        int i;
        int count=0;
        int reminder=0;
        for(i=0;i<len;i++)
        {
            reminder=nums[i]%3;
            count+=Math.min(reminder,3-reminder);
        }
        return count;
    }
}