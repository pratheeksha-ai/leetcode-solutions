class Solution {
    public int[] runningSum(int[] nums) {
        int[] pivot=new int[nums.length];
        pivot[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            pivot[i]+=pivot[i-1]+nums[i];

        }
        return pivot;
    }
}