class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(target>=letters[mid])//f>f
            {
                left=mid+1;
            }
            else 
            {
                right=mid-1;//righ=0
    
           
            }
        
        }
        return letters[left%letters.length];
       
    }
}