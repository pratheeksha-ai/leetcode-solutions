class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int X=0;
       for(String op:operations)
       {
        if(op.contains("--X")||op.contains("X--"))
       {
            X=X-1;
       }
       else
       {
            X=X+1;
       }
       }
       return X;
    }
}