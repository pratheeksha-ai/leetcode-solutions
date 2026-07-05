class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer>hash=new HashSet<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet())
        {
            int value=map.get(key);
            hash.add(value);
        }
        if(map.size()==hash.size())
        {
            return true;
        }
        return false;
        
    }
}