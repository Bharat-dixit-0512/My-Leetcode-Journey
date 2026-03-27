class Solution {
    public int specialArray(int[] nums) {
        int x=nums.length;
        int count;
        for(int i=x;i>=1;i--)
        {  count=0;
           for(int j=0;j<x;j++)
           {
             if(nums[j]>=i)
             {
                count++;
             }
           }
           if(count==i)
           {return count;
           }
        }
        return -1;
    }
}