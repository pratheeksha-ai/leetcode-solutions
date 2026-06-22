class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hash=new HashSet<>();
        for(char c:sentence.toCharArray())
        {
            hash.add(c);
        }
        if(hash.size()==26)
        {
            return true;
        }
        return false;
        
    }
}