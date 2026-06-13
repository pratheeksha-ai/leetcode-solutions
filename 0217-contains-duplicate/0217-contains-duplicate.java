import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        boolean found=true;
        for(int num:nums)
        {
            if(set.contains(num))
            {
                return true;
            }
            else
            {
                set.add(num);
            }
            

        }
        return false;
        
    }
}