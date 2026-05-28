class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i=0; i<n; i++){
            ans[i]=1;
        }
        
        int prefix=1;
        for(int i=1; i<n; i++){
           prefix= nums[i-1] * ans[i-1];
           ans[i] =prefix;
        }
        
        int suffix=1;
        for(int i=n-2; i>=0; i--){
           suffix= nums[i+1] * suffix;
           ans[i] = suffix * ans[i];
        }

        return ans;
    }
}  
