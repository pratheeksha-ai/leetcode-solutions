class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(i!=s.length()-1)
            {
            char ch=s.charAt(i);
            char ch2=s.charAt(i+1);
            int as=(int) ch;
            int as2=(int) ch2;
            sum+=Math.abs(as-as2);
            }
        }
        return sum;
        
    }
}