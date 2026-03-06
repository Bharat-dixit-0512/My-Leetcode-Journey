public class Solution
{
    public int RemoveElement(int[] nums, int val)
    {
        int left = 0;

        for (int right = 0; right < nums.Length; right++)
        {
            if (nums[right] != val)
            {
                nums[left] = nums[right];
                left++;
            }
        }

        return left; 
    }
}