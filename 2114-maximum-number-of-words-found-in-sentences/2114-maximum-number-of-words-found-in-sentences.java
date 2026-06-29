class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String sen:sentences)
        {
            String[] ch=sen.split(" ");
            int count=ch.length;
            if(count>max)
            {
                max=count;
            }
        }
        return max;
    }
}