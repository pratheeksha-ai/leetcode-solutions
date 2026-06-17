class Solution {
    public String processStr(String s) {
        StringBuilder b=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                b.append(s.charAt(i));
            }
            else if(s.charAt(i)=='*')
            {
                if(b.length()>0)
                {
                    b.deleteCharAt(b.length()-1);
                }

            }
            else if(s.charAt(i)=='#')
            {
                b.append(b.toString());
            }
            else
            {
                b.reverse();
            }
        }
        return b.toString();
    }
}