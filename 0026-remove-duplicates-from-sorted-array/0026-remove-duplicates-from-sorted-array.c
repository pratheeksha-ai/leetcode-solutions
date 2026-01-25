int removeDuplicates(int* nums, int numsSize) {
    if(numsSize==0)
    {
        return 0;
    }
    int j=1;
    int i;
    for(i=1;i<numsSize;i++)
    {
        if(nums[i]!=nums[i-1])
        {
            nums[j]=nums[i];
            j=j+1;
        }
    }
    return j;
}