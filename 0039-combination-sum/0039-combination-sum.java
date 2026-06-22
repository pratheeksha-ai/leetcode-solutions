
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>lst=new ArrayList<>();
        solve(candidates,res,lst,target,0);
        return res;
    }
    private void solve(int [] candidates,List<List<Integer>>res,List<Integer>lst,int target,int indx){
        if(indx==candidates.length)
        {
            if(target==0)
            {
                res.add(new ArrayList<>(lst));
            }
            return;
        }
        //pick
        if(candidates[indx]<=target)
        {
            lst.add(candidates[indx]);
            solve(candidates,res,lst,target-candidates[indx],indx);
            lst.remove(lst.size()-1);
        }
        //non-pick
        solve(candidates,res,lst,target,indx+1);
    }
}
