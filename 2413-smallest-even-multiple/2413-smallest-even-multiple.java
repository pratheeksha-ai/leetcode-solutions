class Solution {
    public int smallestEvenMultiple(int n) {
        int a=0;
        if(n==1)
        {
            return 2;
        }
        for(int i=1;i<n;i++)
        {
            int mul=n*i;
            if(mul%n==0 && mul%2==0)
            {
                return n*i; 
            }
        }
        return 0;
        
    }
}