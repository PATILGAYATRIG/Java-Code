class Solution {
    public int minimumOperations(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]%3==1 || nums[i]%3==2)
          {
            k++;
          }

           
        
            
        }
        return k;
        
    }
}