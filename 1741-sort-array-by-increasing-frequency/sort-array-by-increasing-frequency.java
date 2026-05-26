class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA == freqB) {
                return b - a;
            }
            return freqA - freqB;
        });

        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}