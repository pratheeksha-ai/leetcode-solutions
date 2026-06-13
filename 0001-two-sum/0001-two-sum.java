class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        boolean tosum=false;
        int i,j;
        for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}