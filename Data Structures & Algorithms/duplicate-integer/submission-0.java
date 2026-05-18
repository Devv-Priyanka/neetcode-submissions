class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> Duplicate = new HashSet<>();

       for(int x:nums){
        if(Duplicate.contains(x)){
            return true;
        }
        Duplicate.add(x);
       } 
       return false;
    }
}