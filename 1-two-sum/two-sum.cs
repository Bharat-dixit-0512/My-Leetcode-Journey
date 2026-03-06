public class Solution
{
    public int[] TwoSum(int[] nums, int target)
    {
        Dictionary<int, int> dict = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length; i++)
        {
            int other = target - nums[i];
            if (dict.ContainsKey(other))
            {
                return new int[] { dict[other], i };
            }
            if (!dict.ContainsKey(nums[i]))
            {
                dict.Add(nums[i],i);
            }
        }
        return  new int[]{-1,-1};
    }
}