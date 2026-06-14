class Solution {
    public int numIdenticalPairs(int[] nums) 
    {
        int len=nums.length;
        int count=0;
        int i,j;
        for(i=0;i<len;i++)
        {
            for(j=i;j<len;j++)
            {
                if(nums[i]==nums[j] && i<j)
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}